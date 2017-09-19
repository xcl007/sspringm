package com.zhiyou100.springdemo.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.zhiyou100.springdemo.service.IMessageService;
import com.zhiyou100.springdemo.vo.Dept;
@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public String getInfo() {
		return "www.zhiyou.com";
	}

	@Override
	public boolean remove(String mid) {
		Logger.getLogger(MessageServiceImpl.class).info("要删除的mid" + mid);
		
		return false;
	}

}
