package com.example.myshop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/*
 * An aspect is a module that encapsulates a cross-cutting concern.
 *  It contains advice and pointcuts.
 */
@Aspect
public class Notification {
	
	/*
	 * Advice is the code that runs when a particular pointcut is matched.
		sendEmail is a AfterReturning decorated Advice
	*/
	/*
	 * Pointcuts: Pointcuts are expressions that define where advice should be applied.
	 * "execution(* Order.submit(..))" is a PointCut expression
	 * Pointcut expression always begin with one of two Pointcut Designators (execution, within)
	 * within(com.example.myshop.Order) - every method within Order will be a Join Point
	 */
	/*
	 * Join Points: Join points are specific points in your application’s execution where advice can be applied.
	 * The submit method of the Order object (Order.submit) is the Join Point
	 */
	/*
	 * Notice that Pointcut expressions refer to Join Points
	 */
	@AfterReturning("execution(* Order.submit(..))")
	public void sendEmail(JoinPoint joinPoint) {
		System.out.println("----Begin Advice");
		System.out.println("[Notification] Called Advice sendEmail after returning " + joinPoint.getSignature().getName());
		System.out.println("----End Advice");
	}

}
