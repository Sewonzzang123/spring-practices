package com.douzone.container.videosystem;

import static org.junit.Assert.assertEquals;
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

import com.douzone.container.config.videosystem.DVDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {DVDPlayerConfig.class})
public class DVDPlayerJavaConfigTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private DigitalVideoDisc dvd;
	
//	@Autowired
//	private DVDPlayer dvdPlayer;
	
	// 같은 타입의 빈이 2개 이상 존재하는 경우
	//	설정 클래스의 빈 생성 메소드 이름
	@Autowired
	@Qualifier("dvdPlayer03")
	private DVDPlayer player03;
	
	
	// @Bean의 name속성
	@Qualifier("player04")
	private DVDPlayer player04;
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(player03);
	}
	
	@Test
	public void testPlay() {
		player03.play();
		assertEquals("[ playing Movie MARVEL's avengers ]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
}
