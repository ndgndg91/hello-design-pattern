package com.ndgndg91.pizza

import com.ndgndg91.pizza.ingredient.PizzaIngredientFactory

class CheesePizza(
    private val ingredientFactory: PizzaIngredientFactory
): Pizza() {
    init {
        this.name = "시카고 스타일 딥 디쉬 치즈 피자"
    }

    override fun prepare() {
        println("준비 중 : ${this.name}")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }

    override fun cut() {
        println("네모난 모양으로 피자 자르기")
    }
}