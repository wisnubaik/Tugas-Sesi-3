package com.unsiw.kotlinandroid.decor

data class Decoration2(val rocks: String, val wood: String, val diver: String)

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

fun main() {
    makeDecorations()
}
