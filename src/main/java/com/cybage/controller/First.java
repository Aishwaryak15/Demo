package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class First {

	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "hello world";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<String> listData() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		return list;
	}
}
