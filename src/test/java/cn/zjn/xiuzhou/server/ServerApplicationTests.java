package cn.zjn.xiuzhou.server;

import cn.zjn.xiuzhou.server.config.ServerPortCmdConfig;
import cn.zjn.xiuzhou.server.dao.PowerMeterValueRepository;
import cn.zjn.xiuzhou.server.domain.PowerMeterAllValue;
import cn.zjn.xiuzhou.server.service.PowerMeterValueService;
import cn.zjn.xiuzhou.server.utils.ConfigUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ServerApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Autowired
	PowerMeterValueRepository repository;

	@Autowired
	PowerMeterValueService service;

	@Test
	public void testDao(){
		PowerMeterAllValue powerMeterAllValue= new PowerMeterAllValue();
		powerMeterAllValue.setP_FXYGDN((float) 3.2);
		repository.save(powerMeterAllValue);

		service.save(powerMeterAllValue);
	}
	@Autowired
	ConfigUtil configUtil;

	@Test
	public void testConfigUtil(){
		try {
			ServerPortCmdConfig serverPortCmdConfig = configUtil.readConfig();
			System.out.println(serverPortCmdConfig);
			List list = serverPortCmdConfig.getCmds();
			System.out.println(list.get(0));


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
