package com.ldl.observer.myobserver.display;

import com.ldl.observer.myobserver.observer.Observer;
import com.ldl.observer.myobserver.subject.Subject;

/**
 * @Author ldl
 * @Date 2021/5/13 15:53
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature + "，湿度：" + humidity + "%");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
