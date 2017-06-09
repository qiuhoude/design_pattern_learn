package com.hodue.observer.custom;

import com.hodue.observer.custom.observerimpl.CurrentConditionsDisplay;
import com.hodue.observer.custom.observerimpl.ForecastDisplay;
import com.hodue.observer.custom.observerimpl.StatisticsDisplay;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-06-09
 * Time: 06:56
 */
public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
