package com.douzone.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

	@Before("execution(public com.douzone.aoptest.vo.ProductVo com.douzone.aoptest.service.ProductService.find(String))")
	public void beforeAdvice() {
		System.out.println("-------------before Advice--");

	}

	@After("execution(* *..*.service.ProductService.*(..))")
	public void afterAdvice() {
		System.out.println("-------------after Advice--");

	}

	@AfterReturning("execution(* *..*.ProductService.*(..))")
	public void afterReturnAdvice() {
		System.out.println("-------------afterReturning Advice--");

	}

	@AfterThrowing(value = "execution(* *..*.*.*(..))", throwing = "ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("-------------afterThrowingAdvice Advice--" + ex + "---------");

	}

	@Around("execution(* *..*.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		// before advice
		System.out.println("around-before advice");

		// pointcut method 실행
		// 파라미터 가로채기
//		Object[] parameter = { "Camera" };
//		Object result = pjp.proceed(parameter);

		Object result = pjp.proceed();

		// after advice
		System.out.println("around-after advice");

		return result;
	}

}
