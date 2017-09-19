package com.zhiyou100.springdemo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.zhiyou100.springdemo.dao.impl.DeptDaoImpl;
import com.zhiyou100.springdemo.service.IDeptService;
import com.zhiyou100.springdemo.vo.Dept;
@Service(value="aa")
public class DeptServiceImpl implements IDeptService {
	@Resource
    private DeptDaoImpl dao;
	
	@Override
	public boolean add(Dept vo) {
		return dao.doCreat(vo);
	}

}
