package lm.config;

import lm.bean.User1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ming.li
 * @date 2023/11/13 14:26
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public User1 createUser1(){
        return new User1();
    }
}
