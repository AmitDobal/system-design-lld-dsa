package com.amit.systemdesign.observer.example3.subject;

import com.amit.systemdesign.observer.example3.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;


public class BhuvanBam implements YouTuber {
	
	List<Subscriber> subscribers = new ArrayList<>();
	private int videosCount;
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscriber() {
		subscribers.forEach(subscriber -> subscriber.update());
	}

	public void newVideoAdded() {
		videosCount++;
		System.out.println("\nTotal number of subscriber: " + subscribers.size());
		notifySubscriber();
	}
	
	public int getVideosCount() {
		return this.videosCount;
	}

}
