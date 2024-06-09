package com.ndgndg91.pizza.ingredient.chicago

import com.ndgndg91.pizza.ingredient.*

class ChicagoPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(BlackOlives(), Spinach(), EggPlant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicePepperoni()
    }

    override fun creatClam(): Clam {
        return FrozenClams()
    }
}