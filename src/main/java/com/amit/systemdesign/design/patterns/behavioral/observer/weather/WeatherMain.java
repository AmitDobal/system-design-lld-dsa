package com.amit.systemdesign.design.patterns.behavioral.observer.weather;

import com.amit.systemdesign.design.patterns.behavioral.observer.weather.observable.WeatherStation;
import com.amit.systemdesign.design.patterns.behavioral.observer.weather.observer.MobileObserver;
import com.amit.systemdesign.design.patterns.behavioral.observer.weather.observer.TabletObserver;
import com.amit.systemdesign.design.patterns.behavioral.observer.weather.observer.WeatherObserver;

public class WeatherMain {

    public static void main(String[] args) {
        WeatherObserver mobile = new MobileObserver();
        WeatherObserver tablet = new TabletObserver();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.register(mobile);
        weatherStation.register(tablet);


        weatherStation.setTemp(30);
        weatherStation.setTemp(123);
        weatherStation.setTemp(12);

        weatherStation.remove(mobile);

        weatherStation.setTemp(33);
        weatherStation.setTemp(44);


    }
}
