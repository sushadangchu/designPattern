package com.ldl.observer.javaobserver.observable;

import com.ldl.observer.myobserver.observer.Observer;
import com.ldl.observer.myobserver.subject.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * @Author ldl
 * @Date 2021/5/13 15:45
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
