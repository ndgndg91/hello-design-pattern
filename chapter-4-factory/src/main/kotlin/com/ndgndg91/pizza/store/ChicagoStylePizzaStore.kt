package com.ndgndg91.pizza.store

import com.ndgndg91.pizza.*
import com.ndgndg91.pizza.ingredient.chicago.ChicagoPizzaIngredientFactory

class ChicagoStylePizzaStore: PizzaStore() {
    override fun createPizza(type: PizzaType): Pizza {
        val ingredientFactory = ChicagoPizzaIngredientFactory()
        return when(type) {
            PizzaType.CHEESE -> CheesePizza(ingredientFactory)
            PizzaType.PEPPERONI -> PepperoniPizza(ingredientFactory)
            PizzaType.CLAM -> ClamPizza(ingredientFactory)
            PizzaType.VEGGIE -> VeggiePizza(ingredientFactory)
        }
    }
}