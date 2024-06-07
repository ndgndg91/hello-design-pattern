package com.ndgndg91.decorator.beverage.condiment

import com.ndgndg91.decorator.beverage.Beverage
import com.ndgndg91.decorator.beverage.CondimentDecorator
import java.math.BigDecimal

class Decaf(beverage: Beverage): CondimentDecorator() {
    init {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return this.beverage.getDescription() + ", 디카페인"
    }

    override fun cost(): BigDecimal {
        val additionalPrice = when(this.beverage.size) {
            Size.TALL -> BigDecimal("1.1")
            Size.GRANDE -> BigDecimal("1.15")
            Size.VENTI -> BigDecimal("1.20")
        }
        return this.beverage.cost().add(additionalPrice)
    }
}