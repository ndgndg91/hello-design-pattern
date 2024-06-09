package com.ndgndg91.pizza

import com.ndgndg91.pizza.ingredient.PizzaIngredientFactory

class ClamPizza(
    private val ingredientFactory: PizzaIngredientFactory
): Pizza() {
    override fun prepare() {
        println("준비 중 : ${this.name}")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
        clam = ingredientFactory.creatClam()
    }
}