package cn.cuilan.ioc;

import cn.cuilan.ioc.config.Config;
import cn.cuilan.ioc.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	/**
	 * refresh()方法
	 * <p>
	 * Spring如何注册Bean？
	 */
	private static void test1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// Spring如何注册Bean？
		context.register(IndexDao.class);
		IndexDao dao = context.getBean(IndexDao.class);
		dao.query();
	}

	public static void main(String[] args) {
		test1();
	}

}
