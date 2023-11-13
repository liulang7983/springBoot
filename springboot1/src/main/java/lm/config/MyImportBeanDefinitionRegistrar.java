package lm.config;

import lm.bean.User5;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ming.li
 * @date 2023/11/13 16:12
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        System.out.println("加载registerBeanDefinitions");
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(User5.class);
        AbstractBeanDefinition definition = builder.getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("user5",definition);
    }
}
