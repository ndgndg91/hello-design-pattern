package com.ndgndg91.singleton

class EagerInitializationSingleton private constructor() {
    companion object {
        private val INSTANCE = EagerInitializationSingleton()
        fun getInstance() = INSTANCE
    }

    fun doSomething() {
//        println("eagerInitializationSingleton.doSomething")
    }
}