package lm.config;

/**
 * @Author ming.li
 * @Date 2025/3/3 11:02
 * @Version 1.0
 */
import lm.bean.MyService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig1 {
    @Bean
    @ConditionalOnClass(name = "lm.bean.User8")
    public MyService myService() {
        return new MyService();
    }
}
