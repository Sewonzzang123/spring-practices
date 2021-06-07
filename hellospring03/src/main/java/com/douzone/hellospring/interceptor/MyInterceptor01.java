package com.douzone.hellospring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor01 implements HandlerInterceptor {
	/**
	 * preHandle : 반환값이 중요 
	 * 			false:중단하고 남은 인터셉터와 컨트롤러가 실행되지 않음 
	 * 			true:핸들러의 다음 체인이 실행
	 * postHandle : 컨트롤러가 실행된 후에 호출
	 * afterComletion : 뷰에서 최종결과가 생성하는 일을 포함한 모든 일이 완료 되었을 때 실행
	 * 
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("MyInterceptor01.preHandle(..)");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("MyInterceptor01.postHandle(..)");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("MyInterceptor01.afterCompletion(..)");
		
	}

}
