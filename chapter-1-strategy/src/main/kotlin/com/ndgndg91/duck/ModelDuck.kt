package com.ndgndg91.duck

import com.ndgndg91.behavior.fly.FlyNoWay
import com.ndgndg91.behavior.quack.Quack

class ModelDuck: Duck(
    FlyNoWay(),
    Quack()
) {

    override fun display() {
        println("저는 모형 오리입니다.")
    }
}