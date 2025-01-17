package lm;

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
@EnableEcho(packages = {"lm.bean.User6"})
public class MavenSpring7 {
    public static void main(String[] args) {
        //此时跑了MyImportSelector完全是因为本MavenSpring7的@ComponentScan扫描了本文件目录下的MavenSpring5
        // 把他当成了配置类，此时它里面有@Import({User2.class, MyImportSelector.class})所以跑了MyImportSelector
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring7.class, args);
        System.out.println(context.getBean(EchoBeanPostProcessor.class));
        System.out.println(context.getBean(User6.class));
    }
}
