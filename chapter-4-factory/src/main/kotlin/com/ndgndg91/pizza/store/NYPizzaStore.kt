package com.ndgndg91.pizza.store

import com.ndgndg91.pizza.*
import com.ndgndg91.pizza.ingredient.ny.NYPizzaIngredientFactory

class NYPizzaStore: PizzaStore() {
    override fun createPizza(type: PizzaType): Pizza {
        val ingredientFactory = NYPizzaIngredientFactory()
        return when(type) {
            PizzaType.CHEESE -> CheesePizza(ingredientFactory)
            PizzaType.PEPPERONI -> PepperoniPizza(ingredientFactory)
            PizzaType.CLAM -> ClamPizza(ingredientFactory)
            PizzaType.VEGGIE -> VeggiePizza(ingredientFactory)
        }
    }
}