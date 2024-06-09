package com.ndgndg91.pizza.ingredient.ny

import com.ndgndg91.pizza.ingredient.*

class NYPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggiannoCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(Garlic(), Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun creatClam(): Clam {
        return FreshClams()
    }
}