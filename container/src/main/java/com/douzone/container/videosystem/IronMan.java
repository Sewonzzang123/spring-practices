package com.douzone.container.videosystem;

public class IronMan implements DigitalVideoDisc {

	private String title = "IronMan";
	private String studio = "MARVEL";

	@Override
	public void play() {
		System.out.println("[ playing Movie " + studio + "'s " + title + " ]");
	}

}
