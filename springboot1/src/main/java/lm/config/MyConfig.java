package lm.config;

/**
 * @Author ming.li
 * @Date 2025/3/3 10:53
 * @Version 1.0
 */
import lm.bean.Myuser;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    @ConditionalOnProperty(name = "myUser", havingValue = "false")
    public Myuser myuser() {
        return new Myuser();
    }
}
