package com.ndgndg91

import com.ndgndg91.singleton.*
import java.util.concurrent.Executors

fun main() {
//    enum()        // 2185918
//    eager()       // 3302058
//    kotlinLazy()  // 3350404
//    lazy()        // 3085828
    dcl()           // 2575333
}

private fun enum() {
    val executor = Executors.newFixedThreadPool(10)
    val start = System.nanoTime()
    for (i in 1..10) {
        executor.submit {
            EnumSingleton.INSTANCE.doSomething()
        }
    }
    val end = System.nanoTime()
    println("enum time : ${end - start}")
    executor.shutdown()
}

private fun eager() {
    val executor = Executors.newFixedThreadPool(10)
    val start = System.nanoTime()
    for (i in 1..10) {
        executor.submit {
            EagerInitializationSingleton.getInstance().doSomething()
        }
    }
    val end = System.nanoTime()
    println("eager time : ${end - start}")
    executor.shutdown()
}

private fun kotlinLazy() {
    val executor = Executors.newFixedThreadPool(10)
    val start = System.nanoTime()
    for (i in 1..10) {
        executor.submit {
            KotlinLazyInitializationSingleton.getInstance().doSomething()
        }
    }
    val end = System.nanoTime()
    println("kotlin lazy time : ${end - start}")
    executor.shutdown()
}

private fun lazy() {
    val executor = Executors.newFixedThreadPool(10)
    val start = System.nanoTime()
    for (i in 1..10) {
        executor.submit {
            LazySynchronizedSingleton.getInstance().doSomething()
        }
    }
    val end = System.nanoTime()
    println("lazy time : ${end - start}")
    executor.shutdown()
}

private fun dcl() {
    val executor = Executors.newFixedThreadPool(10)
    val start = System.nanoTime()
    for (i in 1..10) {
        executor.submit {
            DCLSingleton.getInstance().doSomething()
        }
    }
    val end = System.nanoTime()
    println("dcl time : ${end - start}")
    executor.shutdown()
}
