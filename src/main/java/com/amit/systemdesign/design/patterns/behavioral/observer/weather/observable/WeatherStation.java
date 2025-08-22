package com.amit.systemdesign.design.patterns.behavioral.observer.weather.observable;

import com.amit.systemdesign.design.patterns.behavioral.observer.weather.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherSubject{
    private final List<WeatherObserver> observers;
    private int temp;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    public void register(WeatherObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void remove(WeatherObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver(){
        this.observers.forEach(observer -> observer.update(this.temp));
    }

    public void setTemp(int temp){
        this.temp = temp;
        notifyObserver();
    }
}
