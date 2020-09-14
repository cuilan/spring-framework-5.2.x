package cn.cuilan.ioc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author zhang.yan
 * @date 2020/8/17
 */
@Repository
public class IndexDao {

	@Autowired
	private TestDao testDao;

	public void query() {
		System.out.println("IndexDao query...");
	}

}
