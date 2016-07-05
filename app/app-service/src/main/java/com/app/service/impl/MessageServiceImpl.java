package com.app.service.impl;

import org.springframework.stereotype.Service;

import com.app.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {

	@Override
	public String getMessage() {
		return "I am message!";
	}

}
