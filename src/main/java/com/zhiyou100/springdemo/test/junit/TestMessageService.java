package com.zhiyou100.springdemo.test.junit;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhiyou100.springdemo.vo.Dept;
import com.zhiyou100.springdemo.vo.Emp;

public class TestMessageService {

	private static ApplicationContext ctx =null;
	static{
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	@Test
	public void test() {
  
		Dept dept=ctx.getBean("dept", Dept.class);
		Logger.getLogger(TestMessageService.class).info(dept);
		
	}

	@Test
	public void testdept1(){
		Dept dept=ctx.getBean("dept1", Dept.class);
		Logger.getLogger(TestMessageService.class).info(dept);
	}
	@Test
	public void emp(){
		Emp emp=ctx.getBean("emp", Emp.class);
		Logger.getLogger(TestMessageService.class).info(emp);
	}
	@Test
	public void emp1(){
		Emp emp=ctx.getBean("emp1", Emp.class);
		Logger.getLogger(TestMessageService.class).info(emp);
	}
	
	@Test
	public void dept4(){
		Logger.getLogger(Dept.class).info(ctx.getBean("dept4", Dept.class));
	}
	@Test
	public void dept6(){
		Dept dept = ctx.getBean("dept6", Dept.class);
		Logger.getLogger(TestMessageService.class).info(dept);
	}
	@Test
	public void dept5(){
		Dept dept = ctx.getBean("dept5", Dept.class);
		Logger.getLogger(TestMessageService.class).info(dept);
	}
	
}
