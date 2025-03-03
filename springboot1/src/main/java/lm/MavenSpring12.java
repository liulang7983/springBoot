package lm;

import lm.bean.MyService2;
import lm.bean.MyService3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
public class MavenSpring12 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring12.class, args);
        System.out.println(context.getBean(MyService3.class));
    }
}
