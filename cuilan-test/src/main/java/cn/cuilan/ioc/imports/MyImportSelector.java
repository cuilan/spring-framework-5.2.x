package cn.cuilan.ioc.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @author zhang.yan
 * @date 2020/8/26
 */
public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
