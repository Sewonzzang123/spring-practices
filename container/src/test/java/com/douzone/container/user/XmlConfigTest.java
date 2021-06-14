package com.douzone.container.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.config.user.AppConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes={AppConfig01.class}) class test
@ContextConfiguration(locations= {"/com/douzone/container/config/user/applicationContext02.xml"}) //xml test
public class XmlConfigTest {
	//spring test
	//전체 환경이 AppConfig01로 container이 만들어지고 
	//XmlConfigTest는 bean 이됨...
	
	@Autowired//classes가 잘못되면 user가 null이거나, 오류가 나겠지
	private User user;

	@Test
	public void testUserNotNull() {
		assertNotNull(user);
	}

	
}
