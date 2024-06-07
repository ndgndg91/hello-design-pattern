package com.ndgndg91.decorator.beverage

import java.math.BigDecimal

class Espresso(size: Size = Size.TALL): Beverage() {
    init {
        this.desc = "에스프레소"
        this.size = size
    }
    override fun cost(): BigDecimal {
        return when(size) {
            Size.TALL -> BigDecimal("1.99")
            Size.GRANDE -> BigDecimal("2.09")
            Size.VENTI -> BigDecimal("2.19")
        }
    }
}