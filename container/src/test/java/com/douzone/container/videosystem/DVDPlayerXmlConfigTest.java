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
	
	@Autowired
	@Qualifier("avengersInfinityWar")
	private DigitalVideoDisc dvd3;
	
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}
	
	@Autowired
	@Qualifier("avengersEndGame")
	private DigitalVideoDisc dvd4;
	
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}
	
//	@Autowired
//	@Qualifier("avengersAgeOfUltron")
//	private DigitalVideoDisc dvd5;
//	
//	@Test
//	public void testDVD5() {
//		assertNotNull(dvd5);
//	}
//	
	@Autowired
	@Qualifier("captainAmerica")
	private DigitalVideoDisc dvd6;
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
	}
	
	@Autowired
	@Qualifier("avengersDirectorEdition")
	private DigitalVideoDisc dvd7;
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
	}
	
	@Autowired
	@Qualifier("avengersTriplepack")
	private DVDPack dvdPack;
	
	@Test
	public void testPack() {
		assertNotNull(dvdPack);
	}
	
	@Autowired
	@Qualifier("avengersExpansionPack1")
	private DigitalVideoDisc dvd8;
	
	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
	}
	
	@Autowired
	@Qualifier("avengersExpansionPack2")
	private DigitalVideoDisc dvd9;
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
	}
	@Autowired
	@Qualifier("avengersExpansionPack3")
	private DigitalVideoDisc dvd10;
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
	}
	
	
	
}
