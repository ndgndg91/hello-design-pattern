package com.ndgndg91.subject

import com.ndgndg91.observer.Observer
import java.math.BigDecimal

class WeatherData : Subject {
    private val observers: MutableList<Observer> = mutableListOf()
    private lateinit var temperature: BigDecimal
    private lateinit var humidity: BigDecimal
    private lateinit var pressure: BigDecimal
    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach {
            it.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: BigDecimal, humidity: BigDecimal, pressure: BigDecimal) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}