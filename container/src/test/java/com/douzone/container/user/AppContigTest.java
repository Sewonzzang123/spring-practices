package com.douzone.container.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.config.user.AppConfig01;

public class AppContigTest {

	// auto config(@Scanning)
	@Test
	public void testAppConfig01() {
		//통과 조건 : assert
		//User user = null;
		//assertNull(user);
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig01.class);

		User user = ac.getBean(User.class);
		assertNotNull(user);
	}
	
	@Test
	public void testAppConfig02() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.douzone.container.config.user");

		User user = ac.getBean(User.class);
//		assertNotNull(user);
	}
}

