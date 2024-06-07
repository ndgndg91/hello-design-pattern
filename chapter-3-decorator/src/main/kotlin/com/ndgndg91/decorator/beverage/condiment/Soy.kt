package com.ndgndg91.decorator.beverage.condiment

import com.ndgndg91.decorator.beverage.Beverage
import com.ndgndg91.decorator.beverage.CondimentDecorator
import java.math.BigDecimal

class Soy(beverage: Beverage): CondimentDecorator() {
    init {
        this.beverage = beverage
    }

    override fun getDescription(): String {
        return this.beverage.getDescription() + ", 두유"
    }

    override fun cost(): BigDecimal {
        val additionalPrice = when(this.beverage.size) {
            Size.TALL -> BigDecimal(".75")
            Size.GRANDE -> BigDecimal(".80")
            Size.VENTI -> BigDecimal(".85")
        }
        return this.beverage.cost().add(additionalPrice)
    }
}