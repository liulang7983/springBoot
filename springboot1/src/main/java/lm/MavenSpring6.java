package lm;

import lm.bean.User2;
import lm.bean.User3;
import lm.bean.User4;
import lm.bean.User5;
import lm.config.MyImportBeanDefinitionRegistrar;
import lm.config.MyImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
@Import({MyImportBeanDefinitionRegistrar.class})
public class MavenSpring6 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring6.class, args);
        System.out.println(context.getBean(User5.class));
    }
}
