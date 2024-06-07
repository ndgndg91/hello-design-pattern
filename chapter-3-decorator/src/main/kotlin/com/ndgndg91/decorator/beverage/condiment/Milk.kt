package com.ndgndg91.decorator.beverage.condiment

import com.ndgndg91.decorator.beverage.Beverage
import com.ndgndg91.decorator.beverage.CondimentDecorator
import java.math.BigDecimal

class Milk(beverage: Beverage): CondimentDecorator() {
    init {
        this.beverage = beverage
    }
    override fun getDescription(): String {
        return this.beverage.getDescription() + ", 우유"
    }

    override fun cost(): BigDecimal {
        val additionalPrice = when(this.beverage.size) {
            Size.TALL -> BigDecimal(".3")
            Size.GRANDE -> BigDecimal(".35")
            Size.VENTI -> BigDecimal(".40")
        }
        return this.beverage.cost().add(additionalPrice)
    }

}