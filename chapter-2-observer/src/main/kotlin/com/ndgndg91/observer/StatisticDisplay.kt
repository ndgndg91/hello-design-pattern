package com.ndgndg91.observer

import com.ndgndg91.subject.WeatherData
import java.math.BigDecimal

class StatisticDisplay(weatherData: WeatherData): Observer, DisplayElement {
    init {
        weatherData.registerObserver(this)
    }
    override fun update(temperature: BigDecimal, humidity: BigDecimal, pressure: BigDecimal) {
        display()
    }

    override fun display() {
        println("평균/최고/최저 미구현")
    }
}