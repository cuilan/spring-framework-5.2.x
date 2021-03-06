package cn.cuilan.ioc.config;

import cn.cuilan.ioc.dao.IndexDao;
import cn.cuilan.ioc.imports.MyImportBeanDefinitionRegistrar;
import cn.cuilan.ioc.imports.MyImportSelector;
import org.springframework.context.annotation.*;

/**
 * @author zhang.yan
 * @date 2020/8/17
 */
@Configuration
@ComponentScan("cn.cuilan.ioc")
//@Import(IndexDao.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
//@EnableAspectJAutoProxy
public class Config {
}
