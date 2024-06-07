package com.ndgndg91.decorator.beverage.condiment

import com.ndgndg91.decorator.beverage.Beverage
import com.ndgndg91.decorator.beverage.CondimentDecorator
import java.math.BigDecimal

class Mocha(beverage: Beverage): CondimentDecorator() {
    init {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return this.beverage.getDescription() + ", 모카"
    }

    override fun cost(): BigDecimal {
        val additionalPrice = when(this.beverage.size) {
            Size.TALL -> BigDecimal(".20")
            Size.GRANDE -> BigDecimal(".25")
            Size.VENTI -> BigDecimal(".30")
        }
        return this.beverage.cost().add(additionalPrice)
    }
}