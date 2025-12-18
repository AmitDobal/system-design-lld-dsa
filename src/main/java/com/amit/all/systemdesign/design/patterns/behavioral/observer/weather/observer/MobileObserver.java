package com.amit.all.systemdesign.design.patterns.behavioral.observer.weather.observer;

public class MobileObserver implements WeatherObserver{

    private int temp;

    @Override
    public void update(int temp) {
       this.temp = temp;
        System.out.println("Mobile device temp: " + this.temp);
    }

    public int getTemp(){
        return this.temp;
    }

}
