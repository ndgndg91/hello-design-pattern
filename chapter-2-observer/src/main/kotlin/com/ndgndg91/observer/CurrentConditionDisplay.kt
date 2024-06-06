package com.ndgndg91.observer

import com.ndgndg91.subject.WeatherData
import java.math.BigDecimal

class CurrentConditionDisplay(
    weatherData: WeatherData
) : Observer, DisplayElement {
    private lateinit var temperature: BigDecimal
    private lateinit var humidity: BigDecimal

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: BigDecimal, humidity: BigDecimal, pressure: BigDecimal) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("현재 상태 : 온도 $temperature F, 습도 $humidity%")
    }
}