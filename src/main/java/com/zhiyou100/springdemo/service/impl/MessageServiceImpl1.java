package com.zhiyou100.springdemo.service.impl;

import org.apache.log4j.Logger;

import com.zhiyou100.springdemo.service.IMessageService1;

public class MessageServiceImpl1 implements IMessageService1 {

	@Override
	public boolean remove(String mid) {
		Logger.getLogger(MessageServiceImpl1.class).info("要掺水的mid" + mid);
		return false;
	}

}
