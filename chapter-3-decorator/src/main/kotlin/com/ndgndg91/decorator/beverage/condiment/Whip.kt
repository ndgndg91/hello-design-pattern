package com.ndgndg91.decorator.beverage.condiment

import com.ndgndg91.decorator.beverage.Beverage
import com.ndgndg91.decorator.beverage.CondimentDecorator
import java.math.BigDecimal

class Whip(beverage: Beverage): CondimentDecorator() {
    init {
        this.beverage = beverage
    }
    override fun getDescription(): String {
        return this.beverage.getDescription() + ", 휘핑"
    }

    override fun cost(): BigDecimal {
        val additionalPrice = when(this.beverage.size) {
            Size.TALL -> BigDecimal(".50")
            Size.GRANDE -> BigDecimal(".55")
            Size.VENTI -> BigDecimal(".60")
        }
        return this.beverage.cost().add(additionalPrice)
    }
}