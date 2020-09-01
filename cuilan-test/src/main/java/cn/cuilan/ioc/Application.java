package cn.cuilan.ioc;

import cn.cuilan.ioc.config.Config;
import cn.cuilan.ioc.dao.IndexDao;
import cn.cuilan.ioc.postprocessor.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	/**
	 * refresh()方法
	 * <p>
	 * Spring如何注册Bean？
	 */
	private static void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Config bean = context.getBean(Config.class);

		// 手动添加 BeanFactoryPostProcessor，没有添加 @Component 注解
		context.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());

		// Spring如何注册Bean？
		context.register(IndexDao.class);
		IndexDao dao = context.getBean(IndexDao.class);
		dao.query();
	}

	public static void main(String[] args) {
		test1();
	}

}
