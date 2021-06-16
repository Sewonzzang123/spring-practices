package com.douzone.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.douzone.hellospring.config.WebConfig;

public class HelloSpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Root Application Context 설정 파일
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// Web Application context 설정 파일
		return new Class<?>[] {WebConfig.class};
	}
	@Override
	protected String[] getServletMappings() {
		// DispatherServlet Mapping Url
		return new String[] {"/"};
	}
}
