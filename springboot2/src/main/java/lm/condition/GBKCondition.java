package lm.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author ming.li
 * @date 2023/11/13 17:17
 */
public class GBKCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String s = System.getProperty("file.encoding");
        if (s.equalsIgnoreCase("GBK")){
            return true;
        }
        return false;
    }
}
