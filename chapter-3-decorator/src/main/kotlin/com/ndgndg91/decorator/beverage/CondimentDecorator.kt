package com.ndgndg91.decorator.beverage

abstract class CondimentDecorator: Beverage() {
    lateinit var beverage: Beverage
    abstract override fun getDescription(): String
}