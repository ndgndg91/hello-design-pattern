package com.ndgndg91.observer

import java.math.BigDecimal

interface Observer {
    fun update(temperature: BigDecimal, humidity: BigDecimal, pressure: BigDecimal)
}