package com.example.myshop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logging {
	
	@After("execution(* Order.submit(..))")
	public void logPurchase(JoinPoint joinPoint) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("----Begin Advice");
		System.out.println("[Logging] Calling Advice logPurchase after " + joinPoint.getSignature().getName());
		System.out.println("----End Advice");
	}
	
	@After("execution(* Order.submit(..))")
	public void postToDynamics365(JoinPoint joinPoint) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("----Begin Advice");
		System.out.println("[Logging] Calling Advice postToDynamics365 after " + joinPoint.getSignature().getName());
		System.out.println("----End Advice");
	}


	@Around("execution(* Order.addProduct(..))")
	public void productAddded(ProceedingJoinPoint  joinPoint) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("----Begin Advice");
		System.out.println("[Logging] Calling Advice productAddded before " + joinPoint.getSignature().getName());
		
		joinPoint.proceed();
		System.out.println("[Logging] Calling Advice productAddded after " + joinPoint.getSignature().getName());
		System.out.println("----End Advice");
	}
	@AfterThrowing("within(com.example.myshop.Order)")
	public void logError(JoinPoint joinPoint) {
		System.out.println("----Begin Advice");
		System.out.println("[Logging] Calling Advice logError after " + joinPoint.getSignature().getName());
		System.out.println("----End Advice");
		
	}

}
