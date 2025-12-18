package com.amit.all.systemdesign.design.patterns.behavioral.observer.weather.observer;


public class TabletObserver implements WeatherObserver {
    private int temp;

    @Override
    public void update(int temp) {
        this.temp = temp;
        System.out.println("Tablet device temp: " + this.temp);
    }

    public int getTemp() {
        return this.temp;
    }
}
