package com.douzone.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.container.videosystem.Avengers;
import com.douzone.container.videosystem.DVDPlayer;
import com.douzone.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	//주입하기(Injection) 1  
	// Bean 생성 메소드 직접 호출  
	// 생성자 주입
//	@Bean
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avengers());
	}
	
	//주입하기(Injection) 2
	//	파라미터로 Bean 전달하기
	//	생성자 주입
//	@Bean 
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd); 
	}
	
	//주입하기(Injection) 3
	//	파라미터로 Bean 전달하기
	//	setter
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer();
		player.setDvd(dvd);
		return player;
	}
	//같은 타입의 빈을 생성할 경우
	//1. 메소드 이름 지정
	//2. 
	@Bean(name="player04")
	public DVDPlayer dvdPlayer04(DigitalVideoDisc dvd) {
		DVDPlayer player = new DVDPlayer();
		player.setDvd(dvd);
		return player;
	}
	
	
}
