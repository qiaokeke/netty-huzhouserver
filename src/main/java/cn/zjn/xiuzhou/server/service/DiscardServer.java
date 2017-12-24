package cn.zjn.xiuzhou.server.service;

import cn.zjn.xiuzhou.server.Handler.DiscardServerHandler;
import cn.zjn.xiuzhou.server.Handler.ToBytesListDecoder;
import cn.zjn.xiuzhou.server.Handler.ToIntegerDecoder;
import cn.zjn.xiuzhou.server.Handler.WriteHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-22 21:20
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */

@Service
public class DiscardServer implements ApplicationContextAware{
    private int port;

    private ApplicationContext applicationContext;

    private ToBytesListDecoder toBytesListDecoder;

    @Autowired
    DiscardServerHandler discardServerHandler;
    public DiscardServer() {
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void run() throws Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // (1)
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap(); // (2)
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class) // (3)
                    .childHandler(new ChannelInitializer<SocketChannel>() { // (4)
                        @Override
                        public void initChannel(SocketChannel ch) throws Exception {
                            toBytesListDecoder = applicationContext.getBean(ToBytesListDecoder.class);
                            ch.pipeline().addLast(toBytesListDecoder);
                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)          // (5)
                    .childOption(ChannelOption.SO_KEEPALIVE, true); // (6)

            // 绑定端口，开始接收进来的连接
            ChannelFuture f = b.bind(port).sync(); // (7)

            // 等待服务器  socket 关闭 。
            // 在这个例子中，这不会发生，但你可以优雅地关闭你的服务器。
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
