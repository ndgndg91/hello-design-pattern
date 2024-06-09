package com.ndgndg91.singleton

class KotlinLazyInitializationSingleton private constructor(){
    companion object {
        private val INSTANCE: KotlinLazyInitializationSingleton by lazy {
            println("KotlinLazyInitializationSingleton INSTANCE")
            KotlinLazyInitializationSingleton()
        }

        fun getInstance(): KotlinLazyInitializationSingleton = INSTANCE
    }

    fun doSomething() {
//        println("KotlinLazyInitializationSingleton.doSomething")
    }
}