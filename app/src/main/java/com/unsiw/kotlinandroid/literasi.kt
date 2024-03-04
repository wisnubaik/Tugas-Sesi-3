package com.unsiw.kotlinandroid

fun main(){
    val ints=listOf(1,2,3)
    println(ints.filter({i->i>1}))
    println(ints.filter({i->1>1}))
}