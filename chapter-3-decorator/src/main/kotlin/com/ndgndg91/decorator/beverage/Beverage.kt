package com.ndgndg91.decorator.beverage

import java.math.BigDecimal

abstract class Beverage {
    enum class Size {
        TALL, GRANDE, VENTI
    }
    var size: Size = Size.TALL
    var desc: String = "제목 없음"

    open fun size(size: Size) = apply { this.size = size }

    open fun size() = this.size

    open fun getDescription(): String {
        return desc
    }

    abstract fun cost(): BigDecimal
}