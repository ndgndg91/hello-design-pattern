package com.ndgndg91.duck

import com.ndgndg91.behavior.fly.FlyBehavior
import com.ndgndg91.behavior.quack.QuackBehavior

abstract class Duck(
    private var flyBehavior: FlyBehavior,
    private var quackBehavior: QuackBehavior
) {
    fun setFlyBehavior(behavior: FlyBehavior) {
        println(this::class.simpleName + "의 flyBehavior ${behavior.javaClass.simpleName} 으로 변경")
        flyBehavior = behavior
    }

    fun setQuackBehavior(behavior: QuackBehavior) {
        quackBehavior = behavior
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.")
    }

    open fun display() {

    }

    fun performFly() {
        flyBehavior.fly()
    }
}