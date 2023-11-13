package lm;

import lm.bean.User5;
import lm.bean.User6;
import lm.config.EchoBeanPostProcessor;
import lm.config.EchoImportBeanDefinitionRegistrar;
import lm.config.EnableEcho;
import lm.config.MyImportBeanDefinitionRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
@EnableEcho(packages = {"lm.bean.User6"})
public class MavenSpring7 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring7.class, args);
        System.out.println(context.getBean(EchoBeanPostProcessor.class));
        System.out.println(context.getBean(User6.class));
    }
}
