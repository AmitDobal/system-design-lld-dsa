package com.amit.systemdesign.observer.example1.observer;


import com.amit.systemdesign.observer.example1.observable.WeatherStationObservable;

public class TvDisplayObserver implements DisplayObserver {
	WeatherStationObservable observable;

	public TvDisplayObserver(WeatherStationObservable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("TV Display observer: " + observable);

	}

}
