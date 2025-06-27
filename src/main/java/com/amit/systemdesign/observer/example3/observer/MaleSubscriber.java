package com.amit.systemdesign.observer.example3.observer;


import com.amit.systemdesign.observer.example3.subject.YouTuber;

public class MaleSubscriber implements Subscriber {
	
	YouTuber youTuber;
	
	public MaleSubscriber(YouTuber youTuber) {
		this.youTuber = youTuber;
	}
	
	@Override
	public void update() {
		System.out.println("New video available!! " + "Video no. " +  youTuber.getVideosCount());
	}

}
