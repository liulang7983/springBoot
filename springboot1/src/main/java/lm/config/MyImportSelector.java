package lm.config;

import lm.bean.User3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author ming.li
 * @date 2023/11/13 15:56
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("加载MyImportSelector");
        return new String[]{User3.class.getName()};
    }
}
