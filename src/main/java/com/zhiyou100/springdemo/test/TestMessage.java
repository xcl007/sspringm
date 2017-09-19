package com.zhiyou100.springdemo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.springdemo.service.IMessageService;
import com.zhiyou100.springdemo.service.IMessageService1;
import com.zhiyou100.springdemo.vo.Dept;

public class TestMessage {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
//		IMessageService iMessageService = cont.getBean("msg", IMessageService.class);
//		System.out.println(iMessageService.getInfo());
//		Logger log= LoggerFactory.getLogger(TestMessage.class);
//		log.info(iMessageService.getInfo());
		
		
	    IMessageService iMessageService = cont.getBean("messageServiceImpl", IMessageService.class);
	    System.out.println(iMessageService.remove("133"));
	
//		IMessageService1 imess= cont.getBean("ServiceImpl1", IMessageService1.class);
//		System.out.println(imess.remove("222"));
	}

}
