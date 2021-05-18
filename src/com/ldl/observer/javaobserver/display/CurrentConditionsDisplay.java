package com.ldl.observer.javaobserver.display;

import com.ldl.observer.javaobserver.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author ldl
 * @Date 2021/5/13 15:53
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature + "，湿度：" + humidity + "%");
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
