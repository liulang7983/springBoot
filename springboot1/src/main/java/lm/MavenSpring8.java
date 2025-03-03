package lm;

import lm.bean.Myuser;
import lm.bean.User6;
import lm.config.EchoBeanPostProcessor;
import lm.config.EnableEcho;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
public class MavenSpring8 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring8.class, args);
        System.out.println(context.getBean(EchoBeanPostProcessor.class));
        System.out.println(context.getBean(Myuser.class));
    }
}
