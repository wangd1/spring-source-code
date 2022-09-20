package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OrderService {

	@Autowired
	private UserService userService;

	public void test(){
		System.out.println(userService);
	}

}
