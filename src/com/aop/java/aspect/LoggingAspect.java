package com.aop.java.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//@Before("execution(public String com.aop.java.model.Circle.getName())")
	//@Before("execution(public String get*())")
	@Before("allGetters()")
	public void LoggingAdvice() {
		System.out.println("Advice run... Getmethod called ");
	}
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("second advice excuted ");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters() {}

}
