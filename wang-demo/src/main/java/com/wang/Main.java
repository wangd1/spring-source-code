package com.wang;

import com.wang.service.OrderService;
import com.wang.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = (UserService)context.getBean("userService");
		OrderService orderService = (OrderService)context.getBean("orderService");
		userService.test();
		orderService.test();

	}
}