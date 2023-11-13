package lm.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author ming.li
 * @date 2023/11/13 16:20
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EchoImportBeanDefinitionRegistrar.class})
public @interface EnableEcho {
    String[] packages();
}
