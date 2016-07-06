package com.app.admin.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.app.mapper.po.UserPOMapper;
import com.app.model.po.UserPO;
import com.app.service.MessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:applicationContext.xml",
	"classpath:applicationContext-jdbc.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class MessageControllerTest {

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
