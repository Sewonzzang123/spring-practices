package com.douzone.container.config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;


/**
 * 
 * JavaConfig2 <------- JavaConfig1
 *  			import
 *  
 *  JavaConfig1 + JavaConfig2
 *  
 */


@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {
	@Bean							// blank dist 주입
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc disc) {
		return new DVDPlayer(disc);
	}
	
	
	
}
