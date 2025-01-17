package lm;

import lm.bean.User1;
import lm.bean.User2;
import lm.bean.User3;
import lm.bean.User4;
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
    //User3在@Import引入的MyImportSelector里面引入，但是User4没有地方引入到bean里面，所以不存在
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring5.class, args);

        System.out.println(context.getBean(User3.class));
        System.out.println(context.getBean(User4.class));
    }
}
