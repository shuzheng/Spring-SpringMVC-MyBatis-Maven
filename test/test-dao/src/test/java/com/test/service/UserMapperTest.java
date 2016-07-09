package com.test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.github.pagehelper.PageHelper;
import com.test.mapper.UserMapper;
import com.test.model.User;

import tk.mybatis.mapper.entity.Example;

/**
 * 测试service
 * @author shuzheng
 * @date 2016年7月6日 下午6:07:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:applicationContext.xml",
	"classpath:applicationContext-jdbc.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void index() {
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getNickname());
		
		User tempUser = new User();
		tempUser.setUsername("test");
		tempUser.setNickname("测试");
		tempUser.setPassword("123456");
		tempUser.setSex(1);
		tempUser.setCtime(System.currentTimeMillis());
		int count = userMapper.insert(tempUser);
		System.out.println("插入：" + count + "条数据，id为：" + tempUser.getId());
		
		Example example = new Example(User.class);
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("id", 1);
		example.createCriteria()
			.andGreaterThan("id", 0);
		example.setOrderByClause("id desc");
		List<User> userList = userMapper.selectByExampleAndRowBounds(example, new RowBounds(0, 10));
		System.out.println(userList.size());
		for (User u : userList) {
			System.out.println(u.getId());
		}
		
		PageHelper.startPage(1, 10);
		List<User> users = userMapper.select(null);
		System.out.println(users.size());
		
	}
	
}
