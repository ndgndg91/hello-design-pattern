package com.ndgndg91.singleton

/**
 * Double-Checked Locking
 */
class DCLSingleton private constructor() {
    companion object {
        private var INSTANCE: DCLSingleton? = null

        fun getInstance(): DCLSingleton {
            if (INSTANCE == null) {
                synchronized(DCLSingleton::class.java) {
                    if (INSTANCE == null) {
                        println("DCLSingleton INSTANCE is null")
                        INSTANCE = DCLSingleton()
                    }
                }
            }

            return INSTANCE!!
        }
    }

    fun doSomething() {
//        println("DCLSingleton.doSomething")
    }

}