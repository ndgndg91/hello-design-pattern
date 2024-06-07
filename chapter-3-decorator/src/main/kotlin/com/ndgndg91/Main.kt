package com.ndgndg91

import com.ndgndg91.decorator.beverage.Beverage
import com.ndgndg91.decorator.beverage.DarkRoast
import com.ndgndg91.decorator.beverage.Espresso
import com.ndgndg91.decorator.beverage.HouseBuild
import com.ndgndg91.decorator.beverage.condiment.Mocha
import com.ndgndg91.decorator.beverage.condiment.Soy
import com.ndgndg91.decorator.beverage.condiment.Whip
import com.ndgndg91.decorator.inputstream.LowerCaseInputStream
import java.io.BufferedInputStream
import java.io.FileInputStream


fun main() {
    input()
    coffee()
}

private fun input() {
    val fileName = "${System.getProperty("user.dir")}/chapter-3-decorator/src/main/resources/test.txt"
    val inputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream(fileName)))
    inputStream.use {
        var c = 0
        val builder = StringBuilder()
        while (c != -1) {
            c = inputStream.read()
            builder.append(c.toChar())
        }

        println(builder)
    }
}

private fun coffee() {
    val beverage = Espresso(Beverage.Size.VENTI)
    println(beverage.getDescription() + " $" + beverage.cost())

    var beverage2 = DarkRoast(Beverage.Size.GRANDE) as Beverage
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2.getDescription() + " $" + beverage2.cost())

    var beverage3 = HouseBuild(Beverage.Size.GRANDE) as Beverage
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println(beverage3.getDescription() + " $" + beverage3.cost())
}