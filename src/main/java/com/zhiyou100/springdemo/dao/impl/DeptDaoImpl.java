package com.zhiyou100.springdemo.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.zhiyou100.springdemo.dao.IDeptDao;
import com.zhiyou100.springdemo.vo.Dept;
@Repository
public class DeptDaoImpl implements IDeptDao{

	@Override
	public boolean doCreat(Dept vo) {
		Logger.getLogger(DeptDaoImpl.class).info(vo);
		return true;
	}

}
