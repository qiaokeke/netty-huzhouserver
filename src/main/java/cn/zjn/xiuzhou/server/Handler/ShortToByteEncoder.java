package cn.zjn.xiuzhou.server.Handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-24 15:30
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */
public class ShortToByteEncoder extends MessageToByteEncoder<Short> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Short aShort, ByteBuf byteBuf) throws Exception {
        byteBuf.writeByte(aShort);
    }
}
