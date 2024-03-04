package com.unsiw.kotlinandroid

fun main() {
    val input = "ini SELASA"
    val encLamb: (String) -> String = { input -> input.toLowerCase() }

    println(encodeMsg(input, ::encNormalFun))
    println(encodeMsg(input, encLamb))
    println(encodeMsg(input, { input -> input.capitalize() }))
}

fun encNormalFun(input: String): String {
    return input.toLowerCase()
}

fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}