package lm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
public class MavenSpring3 {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MavenSpring3.class);
        ConfigurableApplicationContext context = app.run(args);
        System.out.println(context.getEnvironment().getProperty("lm4.name"));
    }
}
