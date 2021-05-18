package com.ldl.observer.javaobserver;

import com.ldl.observer.javaobserver.display.CurrentConditionsDisplay;
import com.ldl.observer.javaobserver.display.ForecastDisplay;
import com.ldl.observer.javaobserver.display.HeatIndexDisplay;
import com.ldl.observer.javaobserver.display.StatisticsDisplay;
import com.ldl.observer.javaobserver.observable.WeatherData;

/**
 * @Author ldl
 * @Date 2021/5/13 15:57
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
