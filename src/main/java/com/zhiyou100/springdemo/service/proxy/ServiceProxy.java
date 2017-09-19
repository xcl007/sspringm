package com.zhiyou100.springdemo.service.proxy;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.sun.org.apache.bcel.internal.generic.NEW;
@Aspect
@Component
public class ServiceProxy {
	@Around("execution(* com.zhiyou100.springdemo.service.impl.MessageServiceImpl.*(..))")
	public Object arroundInvoke(ProceedingJoinPoint point) throws Throwable{
		Logger.getLogger(ServiceProxy.class).info("执行参数：" + Arrays.toString(point.getArgs()));
		Object obj=point.proceed(new Object[] {"zhiyou"});
		Logger.getLogger(ServiceProxy.class).info("执行参数之后：" + obj);
		return true;
	}
    @Before(value="execution(* com.zhiyou100.springdemo.service.impl.MessageServiceImpl.*(..)) and args(id)",argNames="id")
    
	public void beforeinvoke(Object ar){
		Logger.getLogger(ServiceProxy.class).info("程序调用之前调用" + ar);
	}
    @After("execution(* com.zhiyou100.springdemo.service.impl.MessageServiceImpl.*(..))")
	public void afterinvoke(){
		Logger.getLogger(ServiceProxy.class).info("程序调用之后使用");
	}
    @AfterReturning(value="execution(* com.zhiyou100.springdemo.service.impl.MessageServiceImpl.*(..))",returning="v",argNames="v")
	public void returninvoke(Object vl){
		Logger.getLogger(ServiceProxy.class).info("返回：" + vl);
	}
    @AfterThrowing(value="execution(* com.zhiyou100.springdemo.service.impl.MessageServiceImpl.*(..))",throwing="e",argNames="e")
	public void throwInvoke(Exception e){
		
			Logger.getLogger(ServiceProxy.class).error("返回一个异常：" + e);
	}
//	
//	public Object arroundInvoke(ProceedingJoinPoint point) throws Throwable{
//		Logger.getLogger(ServiceProxy.class).info("执行参数：" + Arrays.toString(point.getArgs()));
////		Object obj =point.proceed(point.getArgs());
//		Object obj =point.proceed(new Object[] {"zhiyou"});
//		Logger.getLogger(ServiceProxy.class).info("执行之后：" + obj);
//		return true;
//		
//	}
}
