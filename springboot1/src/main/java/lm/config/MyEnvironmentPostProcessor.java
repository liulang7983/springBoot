package lm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * @author ming.li
 * @date 2023/11/13 15:02
 */
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try {
            //外部导入只支持properties，yml会获取不到
            FileInputStream file = new FileInputStream("C:\\gitLiming\\application-c.properties");
            Properties properties = new Properties();
            properties.load(file);
            System.out.println("导入:"+properties.getProperty("lm4.name"));
            PropertiesPropertySource my = new PropertiesPropertySource("my", properties);
            environment.getPropertySources().addLast(my);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
