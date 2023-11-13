package lm.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author ming.li
 * @date 2023/11/13 16:21
 */
public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
        Map<String, Object> objectMap = annotationMetadata.getAnnotationAttributes(EnableEcho.class.getName());
        String[] strings=(String[])objectMap.get("packages");
        List<String> list = Arrays.asList(strings);
        builder.addPropertyValue("packages",list);
        System.out.println("list.size:"+list.size());
        beanDefinitionRegistry.registerBeanDefinition("builder",builder.getBeanDefinition());

    }
}
