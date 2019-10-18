package com.wuml.component.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author by wml on 2019/10/17.
 */
public class SystemCondition implements Condition {

    /**
     * 采用网上较为普遍的配置 判定当前运行环境的系统是否是windows
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String property = context.getEnvironment().getProperty("os.name");
        System.out.println("运行环境:"+property.toUpperCase());
        if(property.toUpperCase().contains("LINUX")){
            return true;
        }
        return false;
    }
}
