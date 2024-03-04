package com.unsiw.kotlinandroid

fun main() {
    val kali ={x:Int, y:Int, z:String -> "nilai $z = ${x*y}"}
    val bagi : (Int, Int, String) -> String = {x,y,z -> "nilai $z = ${x*y}"}
    println(kali(2,3,"2 kali 3"))
    println(bagi(6,3,"6 bagi 3"))

    var dirtLevel = 20
    val waterFilter1 = {level: Int -> level / 2}
    val waterFilter2:(Int) -> Int = {level -> level / 2}
    println(waterFilter1(dirtLevel))
    println(waterFilter2(dirtLevel))
}