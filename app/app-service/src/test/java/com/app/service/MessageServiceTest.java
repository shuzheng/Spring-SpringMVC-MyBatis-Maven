package com.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.app.mapper.UserMapper;
import com.app.model.User;
import com.app.model.UserVO;

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
public class MessageServiceTest {

	@Autowired
	private MessageService messageService;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void index() {
		String message = messageService.getMessage();
		System.out.println(message);
		
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getNickname());
		
		UserVO userVO = userService.selectUserWithBook(1);
		System.out.println(userVO.getBooks().size());
		
		User user2 = userService.getMapper().selectByPrimaryKey(1);
		System.out.println(user2.getNickname());
	}
	
}
