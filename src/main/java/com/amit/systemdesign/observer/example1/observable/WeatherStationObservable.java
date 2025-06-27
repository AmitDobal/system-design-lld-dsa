package com.amit.systemdesign.observer.example1.observable;


import com.amit.systemdesign.observer.example1.observer.DisplayObserver;

public interface WeatherStationObservable {
	public void add(DisplayObserver observer);

	public void remove(DisplayObserver observer);
	
	public void notifies();
	
	public void setTemp();
	

}
