package com.ndgndg91

import com.ndgndg91.observer.CurrentConditionDisplay
import com.ndgndg91.observer.ForecastDisplay
import com.ndgndg91.observer.StatisticDisplay
import com.ndgndg91.subject.WeatherData
import java.math.BigDecimal

fun main() {
    val weatherData = WeatherData()

    val currentConditionDisplay = CurrentConditionDisplay(weatherData)
    val statisticDisplay = StatisticDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(BigDecimal.valueOf(80), BigDecimal.valueOf(65), BigDecimal.valueOf(30.4))
    weatherData.setMeasurements(BigDecimal.valueOf(82), BigDecimal.valueOf(70), BigDecimal.valueOf(29.2))
    weatherData.setMeasurements(BigDecimal.valueOf(78), BigDecimal.valueOf(95), BigDecimal.valueOf(29.2))
}