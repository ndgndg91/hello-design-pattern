package com.ndgndg91.duck

import com.ndgndg91.behavior.fly.FlyWithWings
import com.ndgndg91.behavior.quack.Quack

class MallardDuck: Duck(
    FlyWithWings(),
    Quack()
) {
    override fun display() {
        println("저는 물오리입니다.")
    }
}