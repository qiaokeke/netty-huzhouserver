package cn.zjn.xiuzhou.server;

import cn.zjn.xiuzhou.server.service.DiscardServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ServerApplication.class, args);
		DiscardServer server = context.getBean(DiscardServer.class);
		server.setPort(8888);
		try {
			server.run();
		}catch (Exception e){

		}



	}
}
