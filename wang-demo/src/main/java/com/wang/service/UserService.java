package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author 周瑜
 */

@Component
public class UserService  {

	@Autowired
	private OrderService orderService;

	public void test() {
		System.out.println(orderService+"::"+ LocalDateTime.now());
	}


}
