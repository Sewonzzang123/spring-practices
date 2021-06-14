package com.douzone.container.videosystem;

public class DVDPlayer {
	//component안달거야	
	private DigitalVideoDisc dvd;
	
	public DVDPlayer() {}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	
	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void play() {
		dvd.play();
	}
}
