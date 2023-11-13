package lm;

import lm.bean.User1;
import lm.bean.User2;
import lm.bean.User3;
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
@Import({User2.class, MyImportSelector.class})
public class MavenSpring5 {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring5.class, args);

        System.out.println(context.getBean(User3.class));
    }
}
