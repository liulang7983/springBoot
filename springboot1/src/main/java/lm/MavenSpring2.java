package lm;

import lm.bean.User1;
import lm.bean.User2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author ming.li
 * @date 2023/11/13 11:52
 */
@SpringBootApplication
@Import({User2.class})
public class MavenSpring2 {
    //User自己@Component引入bean了,User1在BeanConfiguration@bean了,User2在本类中@Import引入了
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MavenSpring2.class, args);
        System.out.println(context.getBean("user"));
        System.out.println(context.getBean(User1.class));
        System.out.println(context.getBean(User2.class));

    }
}
