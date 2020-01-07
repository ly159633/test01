package com.hqyj.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqyj.vo.ApplicationConfigTestBean;
@RestController
//@Controller
public class TestController {
	@Value("${server.port}")
	private int port;
	@Value("${com.hqyj.age}")
	private int age;
	@Value("${com.hqyj.name}")
	private String name;
	@Value("${com.hqyj.description}")
	private String description;
	@Value("${com.hqyj.random}")
	private String random;
	
	
	@Autowired
	private ApplicationConfigTestBean configTestBean;
	
	@RequestMapping("/test/getconfig")
	@ResponseBody
	public String getconfig() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(port)
			.append("---").append(name)
			.append("---").append(age).append("</br>");
		sb.append(configTestBean.getName())
			.append("----").append(configTestBean.getAge()).append("</br>");
		
		
		return sb.toString();
		
	}
	
	@RequestMapping("/test/hello")
	public String hellojava() {
		
		return "hellojava!!!";
		
	}

}
