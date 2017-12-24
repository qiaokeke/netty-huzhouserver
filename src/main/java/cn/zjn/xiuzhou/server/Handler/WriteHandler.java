package cn.zjn.xiuzhou.server.Handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-24 14:49
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */

public class WriteHandler extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        while (true){
            byteBuf.writeByte(11);
            Thread.sleep(1000);
            ctx.flush();
        }


    }
}
