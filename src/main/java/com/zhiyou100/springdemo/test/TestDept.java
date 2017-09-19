package com.zhiyou100.springdemo.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.springdemo.service.IDeptService;
import com.zhiyou100.springdemo.vo.Dept;

public class TestDept {

	private static ApplicationContext ctx =null;
	static {
		ctx= new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
	public static void main(String[] args) {

		IDeptService service = ctx.getBean("aa", IDeptService.class);
		Dept dept = ctx.getBean("dept2", Dept.class);
		service.add(dept);
		
	}

}
