package com.amit.systemdesign.observer.example1.observer;


import com.amit.systemdesign.observer.example1.observable.WeatherStationObservable;

public class MobileDisplayObserver implements DisplayObserver {
	WeatherStationObservable observable;

	public MobileDisplayObserver(WeatherStationObservable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("Mobile Display observer: " + observable);
	}

}
