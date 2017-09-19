package com.zhiyou100.springdemo.service.proxy;

import org.apache.log4j.Logger;

public class ServiceProxy1 {

	public void before(){
		Logger.getLogger(ServiceProxy1.class).info("之前");
	}
	public void after(){
		Logger.getLogger(ServiceProxy1.class).info("之后");
	}
}
