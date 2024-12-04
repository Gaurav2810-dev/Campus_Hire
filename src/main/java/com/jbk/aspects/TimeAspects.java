package com.jbk.aspects;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class TimeAspects {
	Logger logger = LoggerFactory.getLogger(TimeAspects.class);
	

	@Before("execution(* com.jbk.controller.*.*(..))")
	public void captureStartTime()
	{
		System.out.println("start Time="+LocalDateTime.now());
	}
	
	@After("execution(* com.jbk.controller.*.*(..))")
		public void captureEndTime()
		{
			System.out.println("End Time="+LocalDateTime.now());
		}
	// track execution time
	@Around("execution(* com.jbk.controller.*.*(..))")
	public Object trackExectionTime(ProceedingJoinPoint joinpoint) throws Throwable
	{
		
		long starttime = System.currentTimeMillis();
		
		//System.out.println("start Time="+LocalDateTime.now());
		Object obj = joinpoint.proceed();
		//System.out.println("end Time="+LocalDateTime.now());
		long endtime =System.currentTimeMillis();
		
		logger.info("Execution time="+(endtime-starttime));
		return obj;
		
	}
	
}
