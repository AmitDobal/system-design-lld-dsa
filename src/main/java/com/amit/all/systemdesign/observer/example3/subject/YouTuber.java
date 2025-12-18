package com.amit.all.systemdesign.observer.example3.subject;


import com.amit.all.systemdesign.observer.example3.observer.Subscriber;

public interface YouTuber {
	
	public void subscribe(Subscriber subscriber);
	public void unsubscribe(Subscriber subscriber);
	public void notifySubscriber();
	
	public void newVideoAdded();
	public int getVideosCount();
}
