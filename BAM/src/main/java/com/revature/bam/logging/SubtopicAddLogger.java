package com.revature.bam.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;

public class SubtopicAddLogger {
//	/* TODO: Remove Sysouts */
//	
//	/**
//	 * Returns the affected class's name and the date and time the method was invoked. 
//	 * @throws Throwable 
//	 */
//	@Around("execution (* com.revature.bam.controller.SubtopicAddController.*(..))")
//	public void classNameAndTime(ProceedingJoinPoint pjp) throws Throwable {
//		String sdf = new SimpleDateFormat("MM-dd-yyyy, hh:mm:ss.SSS a ").format(new Date());
//		System.out.print(sdf);
//		System.out.print(" -- SubtopicAddController -- ");
//		
//		long start = System.currentTimeMillis();
//		pjp.proceed();
//		long end = System.currentTimeMillis();
//		System.out.println("Total time: " + (end-start) + " milliseconds.");
//		
//	}
//	
//	@Before("execution (* com.revature.bam.controller.SubtopicAddController.*(..))")
//	public void beforeMethod(JoinPoint jp) {
//		System.out.println("Before " + jp.getSignature().getName() + " method.");
//	}
//	
//	@After("execution (* com.revature.bam.controller.SubtopicAddController.*(..))")
//	public void afterMethod(JoinPoint jp) {
//		System.out.println("After " + jp.getSignature().getName() + " method.");
//	}
}
