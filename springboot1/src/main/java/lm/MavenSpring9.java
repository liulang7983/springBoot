package lm;

import lm.bean.MyService;
import lm.bean.Myuser;
import lm.config.EchoBeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
public class MavenSpring9 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring9.class, args);
        System.out.println(context.getBean(MyService.class));
    }
}
