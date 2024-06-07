package com.ndgndg91.decorator.beverage

import java.math.BigDecimal

class HouseBuild(size: Size = Size.TALL): Beverage() {
    init {
        this.desc = "하우스 블렌드 커피"
        this.size = size
    }

    override fun cost(): BigDecimal {
        return when(size){
            Size.TALL -> BigDecimal(".89")
            Size.GRANDE -> BigDecimal(".99")
            Size.VENTI -> BigDecimal("1.09")
        }
    }
}