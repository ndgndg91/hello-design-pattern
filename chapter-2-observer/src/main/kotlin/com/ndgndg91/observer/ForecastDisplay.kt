package com.ndgndg91.observer

import com.ndgndg91.subject.WeatherData
import java.math.BigDecimal

class ForecastDisplay(weatherData: WeatherData): Observer, DisplayElement {
    private lateinit var temperature: BigDecimal
    private lateinit var humidity: BigDecimal
    private lateinit var pressure: BigDecimal
    init {
        weatherData.registerObserver(this)
    }
    override fun update(temperature: BigDecimal, humidity: BigDecimal, pressure: BigDecimal) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("기상 예보 미구현")
    }
}