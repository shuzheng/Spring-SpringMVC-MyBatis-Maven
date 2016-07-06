package com.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.app.mapper.po.UserPOMapper;
import com.app.model.po.UserPO;

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
	private UserPOMapper userMapper;
	
	@Test
	public void index() {
		System.out.println(messageService.getMessage());
		UserPO user = userMapper.selectByPrimaryKey(1);
		System.out.println(user.getNickname());
	}
	
}
