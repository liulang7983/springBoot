package lm.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author ming.li
 * @date 2023/11/13 17:21
 */
@Configuration
public class EncodingConvertConfiguration {
    @Bean
    @Conditional(GBKCondition.class)
    public GBKEncodingConvert createGBKEncodingConvert(){
        return new GBKEncodingConvert();
    }

    @Bean
    @Conditional(UTF8Condition.class)
    public UTF8EncodingConvert createUTF8EncodingConvert(){
        return new UTF8EncodingConvert();
    }
}
