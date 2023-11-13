package lm.config;

import lm.bean.User3;
import lm.bean.User4;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author ming.li
 * @date 2023/11/13 15:56
 */
@Service
public class MyImportSelector2 implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        System.out.println("加载MyImportSelector2");
        return new String[]{User4.class.getName()};
    }
}
