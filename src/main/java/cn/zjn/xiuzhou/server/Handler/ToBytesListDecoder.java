package cn.zjn.xiuzhou.server.Handler;

import cn.zjn.xiuzhou.server.domain.PowerMeterAllValue;
import cn.zjn.xiuzhou.server.service.PowerMeterValueService;
import cn.zjn.xiuzhou.server.utils.BytesFormatUtil;
import cn.zjn.xiuzhou.server.utils.DataParseUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-23 9:31
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */
@Component
@Scope("prototype")
public class ToBytesListDecoder extends ByteToMessageDecoder {

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    PowerMeterValueService powerMeterValueService;
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byte[] bytes1 = new byte[0x68+5];
        byte[] bytes2 = new byte[0xF0+5];
        byte[] bytes3 = new byte[0x10+5];



        byte[] discardBytes = new byte[2048];
        if(byteBuf.isReadable()){
            int i3 = byteBuf.indexOf(0,byteBuf.readableBytes()-1, (byte) 0x03);
            logger.info(String.valueOf(i3));
            if (i3<0){
                //没有相关的想要的数据
                //丢弃缓冲区数据
                int length = byteBuf.readableBytes();
                if(length>2048)
                    length=2048;
                byteBuf.readBytes(discardBytes,0,byteBuf.readableBytes());
                String bytesString = BytesFormatUtil.bytesToHexFun(discardBytes,length);
                logger.info("discard: "+bytesString);
                byteBuf.discardReadBytes();
                channelHandlerContext.write("nnnnnnn");
                channelHandlerContext.flush();
                return;
            }

            byte nextbyte = byteBuf.getByte(i3+1);
            switch (nextbyte){
                case (byte) 0x68:
                    int length = byteBuf.readableBytes();
                    if (length<i3+4+0x68)
                        break;
                    byteBuf.readBytes(discardBytes,0,i3-1);
                    ByteBuf byteBuf1 = byteBuf.readBytes(0x68+5);

                    DataParseUtil.addPowerMeter68Value(byteBuf1);
                    //byteBuf1.readBytes(bytes1,0,bytes1.length);
                    DataParseUtil.printPowerMeterAllValueMap();
                    byteBuf.discardReadBytes();
                    break;
                case (byte) 0xF0:
                    length = byteBuf.readableBytes();
                    if (length<i3+4+0xF0)
                        break;
                    byteBuf.readBytes(discardBytes,0,i3-1);
                    ByteBuf byteBuf2 = byteBuf.readBytes(0xF0+5);

                    DataParseUtil.addPowerMeterF0Value(byteBuf2);
                    byteBuf.discardReadBytes();
                    break;
                case (byte) 0x10:
                    length = byteBuf.readableBytes();
                    if (length<i3+4+0x10)
                        break;
                    byteBuf.readBytes(discardBytes,0,i3-1);
                    ByteBuf byteBuf3 = byteBuf.readBytes(0x10+5);
                    PowerMeterAllValue powerMeterAllValue = DataParseUtil.addPowerMeter10Value(byteBuf3);

                    powerMeterValueService.save(powerMeterAllValue);
                    byteBuf.discardReadBytes();
                    DataParseUtil.printPowerMeterAllValueMap();
                    break;
                default:
                    byteBuf.readBytes(discardBytes,0,i3+1);
                    String bytesString = BytesFormatUtil.bytesToHexFun(discardBytes,i3+1);
                    logger.info("default: "+bytesString);
                    byteBuf.discardReadBytes();
                    break;
            }

        }
    }
}
