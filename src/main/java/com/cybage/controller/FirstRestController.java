package com.cybage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@RequestMapping("/rhello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("hello response enitty", HttpStatus.OK);
	}
	
	@RequestMapping("/rlist")
	public ResponseEntity<List<String>> listData() {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		return new ResponseEntity<List<String>>(list, HttpStatus.OK);
	}
}
