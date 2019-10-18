package com.wuml.component.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author by wml on 2019/10/17.
 */
public class ImporterSelector implements ImportSelector {
    /**
     * Select and return the names of which class(es) should be imported
     * @param importingClassMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.wuml.component.imports.ImportWater"};
    }
}
