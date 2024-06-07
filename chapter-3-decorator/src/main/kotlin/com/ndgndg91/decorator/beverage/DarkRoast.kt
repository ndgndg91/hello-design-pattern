package com.ndgndg91.decorator.beverage

import java.math.BigDecimal

class DarkRoast(size: Size = Size.TALL): Beverage() {
    init {
        this.desc = "다크 로스팅"
        this.size = size
    }
    override fun cost(): BigDecimal {
        return when (size) {
            Size.TALL -> BigDecimal(".99")
            Size.GRANDE -> BigDecimal("1.09")
            Size.VENTI -> BigDecimal("1.19")
        }
    }
}