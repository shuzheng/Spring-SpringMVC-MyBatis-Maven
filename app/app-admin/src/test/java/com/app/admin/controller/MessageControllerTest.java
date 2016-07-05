package com.app.admin.controller;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.app.service.MessageService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"classpath:applicationContext.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class MessageControllerTest {

	@Resource
	private MessageService messageService;
	
	@Test
	public void index() {
		System.out.println(messageService.getMessage());
	}
	
}
