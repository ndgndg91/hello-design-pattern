package com.ndgndg91.pizza

import com.ndgndg91.pizza.ingredient.*

abstract class Pizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var veggies: List<Veggies>
    lateinit var cheese: Cheese
    lateinit var pepperoni: Pepperoni
    lateinit var clam: Clam

    abstract fun prepare()

    open fun bake() {
        println("175도에서 25분 간 굽기")
    }

    open fun cut() {
        println("피자를 사선으로 자르기")
    }

    open fun box() {
        println("상자에 피자 담기")
    }
}