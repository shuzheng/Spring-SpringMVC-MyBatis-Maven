package com.app.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("message", messageService.getMessage());
		return "/message/index";
	}
	
	@ResponseBody
	@RequestMapping("/json")
	public Object json() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result", "success");
		return result;
	}
	
}
