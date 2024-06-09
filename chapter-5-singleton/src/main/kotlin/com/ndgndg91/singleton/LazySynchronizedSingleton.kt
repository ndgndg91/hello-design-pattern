package com.ndgndg91.singleton

class LazySynchronizedSingleton private constructor() {

    companion object {
        private var instance: LazySynchronizedSingleton? = null

        fun getInstance(): LazySynchronizedSingleton {
            return synchronized(this) {
                if (instance == null) {
                    println("LazySynchronizedSingleton instance initialized.")
                    instance = LazySynchronizedSingleton()
                }
                instance!!
            }
        }
    }

    fun doSomething() {
//        println("LazySynchronizedSingleton.doSomething")
    }
}