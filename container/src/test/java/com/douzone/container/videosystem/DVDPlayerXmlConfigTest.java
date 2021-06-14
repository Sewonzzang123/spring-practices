package com.douzone.container.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:com/douzone/container/config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	// 예외 발생
	// XML Bean 설정 시 id는 자동으로 부여 되지 않는다. 
	//@Autowired
	// @Qualifier 사용 불가
	private DigitalVideoDisc dvd1;

	@Test
	@Ignore
	public void testDVD1() {
		assertNotNull(dvd1);
	}
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;

	@Test
	public void testDVD2() {
		assertNotNull(dvd2);
	}
}
