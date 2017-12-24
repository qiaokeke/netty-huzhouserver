package cn.zjn.xiuzhou.server.utils;

import cn.zjn.xiuzhou.server.config.ServerPortCmdConfig;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-24 10:12
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */

@Component
public class ConfigUtil {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${config.filename}")
    String fileName;

    ServerPortCmdConfig serverPortCmdConfig;

    public  ServerPortCmdConfig readConfig() throws IOException {
        logger.info(fileName);
        Gson gson = new Gson();

        Resource resource = new ClassPathResource(fileName);
        File file = resource.getFile();
        JsonReader reader = new JsonReader(new FileReader(file));
        serverPortCmdConfig = gson.fromJson(reader,ServerPortCmdConfig.class);
        return serverPortCmdConfig;
    }



}
