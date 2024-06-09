package com.ndgndg91

import com.ndgndg91.pizza.PizzaType
import com.ndgndg91.pizza.store.ChicagoStylePizzaStore
import com.ndgndg91.pizza.store.NYPizzaStore

fun main() {
    val nyStore = NYPizzaStore()
    val chicagoStore = ChicagoStylePizzaStore()

    val nyCheesePizza = nyStore.orderPizza(PizzaType.CHEESE)
    println()
    val chicagoCheesePizza = chicagoStore.orderPizza(PizzaType.CHEESE)
    println()

    println("미니가 주문한 ${nyCheesePizza.name}")
    println("기리가 주문한 ${chicagoCheesePizza.name}")
}