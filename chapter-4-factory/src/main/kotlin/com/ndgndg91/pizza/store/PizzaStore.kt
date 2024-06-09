package com.ndgndg91.pizza.store

import com.ndgndg91.pizza.Pizza
import com.ndgndg91.pizza.PizzaType

abstract class PizzaStore {

    fun orderPizza(type: PizzaType): Pizza {
        val pizza = createPizza(type)

        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza
    }

    abstract fun createPizza(type: PizzaType): Pizza
}