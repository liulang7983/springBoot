package lm;

import lm.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
@EnableAsync
public class MavenSpring4 {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MavenSpring4.class);
        ConfigurableApplicationContext context = app.run(args);
        //此时这连个方法会开启县城吃去u处理，然后继续往下走
        context.getBean(Runnable.class).run();
        context.getBean(UserService.class).init();
        System.out.println("启动完成");
    }
}
