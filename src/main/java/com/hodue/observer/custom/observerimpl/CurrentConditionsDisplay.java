package com.hodue.observer.custom.observerimpl;

import com.hodue.observer.custom.DisplayElement;
import com.hodue.observer.custom.Observer;
import com.hodue.observer.custom.Subject;

/**
 * Created by IntelliJ IDEA.
 * User: hodue
 * Date: 2017-06-09
 * Time: 06:50
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
