package cn.cuilan.ioc.imports;

import cn.cuilan.ioc.service.IndexService;
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
		return new String[]{IndexService.class.getName()};
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
