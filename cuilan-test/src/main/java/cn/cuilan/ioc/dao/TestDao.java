package cn.cuilan.ioc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhang.yan
 * @date 2020/9/14
 */
@Component
public class TestDao {

	@Autowired
	private IndexDao indexDao;

}
