package com.douzone.container.videosystem;

public class Avengers implements DigitalVideoDisc{
	
	private String title="avengers";
	private String studio="MARVEL";
	
	@Override
	public void play() {
		System.out.println("[ playing Movie "+ studio +"'s "+ title +" ]");
	}
}
