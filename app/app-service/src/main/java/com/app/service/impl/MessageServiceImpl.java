package com.app.service.impl;

import org.springframework.stereotype.Service;

import com.app.service.MessageService;

/**
 * 消息service实现
 * @author shuzheng
 * @date 2016年7月6日 下午6:07:27
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService {

	/**
	 * 获取消息
	 * @return
	 */
	@Override
	public String getMessage() {
		return "I am message!";
	}

}
