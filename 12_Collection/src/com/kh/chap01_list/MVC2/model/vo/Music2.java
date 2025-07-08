package com.kh.chap01_list.MVC2.model.vo;

public class Music2 {
	
	private String title;
	private String artist;
	
	public Music2() {}

	public Music2(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music2 [title=" + title + ", artist=" + artist + "]";
	}
	
	

}
