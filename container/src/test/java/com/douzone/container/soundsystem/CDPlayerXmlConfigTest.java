package com.douzone.container.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:com/douzone/container/config/soundsystem"})
public class CDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule =  new SystemOutRule().enableLog();
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	@Ignore
	public void testCDPlayerNotNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		//화면출력되는 것도 assert 해야 자동화를 할 수 있겠지
		cdPlayer.play();
		//replace로 개행 없애기
		assertEquals("[ Playing 붕붕 by 김하온 ]",systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

}
