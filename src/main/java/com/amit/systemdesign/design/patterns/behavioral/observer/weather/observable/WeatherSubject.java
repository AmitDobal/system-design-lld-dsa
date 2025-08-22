package com.amit.systemdesign.design.patterns.behavioral.observer.weather.observable;

import com.amit.systemdesign.design.patterns.behavioral.observer.weather.observer.WeatherObserver;

public interface WeatherSubject {

    void register(WeatherObserver observer);
    void remove(WeatherObserver observer);
    void notifyObserver();
}
