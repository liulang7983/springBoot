package lm.config;

/**
 * @Author ming.li
 * @Date 2025/3/3 11:02
 * @Version 1.0
 */
import lm.bean.MyService;
import lm.bean.MyService1;
import lm.bean.MyService2;
import lm.bean.MyService3;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig1 {
    @Bean
    @ConditionalOnClass(name = "lm.bean.User8")
    public MyService myService() {
        return new MyService();
    }
    @Bean
    @ConditionalOnMissingClass(value = "lm.bean.User9")
    public MyService1 myService1() {
        return new MyService1();
    }
    @Bean
    @ConditionalOnBean(name = {"user"})
    public MyService2 myService2() {
        return new MyService2();
    }
    @Bean
    @ConditionalOnMissingBean(name = {"user99"})
    public MyService3 myService3() {
        return new MyService3();
    }
}
