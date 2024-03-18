package com.unsiw.kotlinandroid
interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

abstract class AquariumFish : FishColor {
    abstract override val color: String
}

class Shark : AquariumFish(), FishAction, FishColor {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : AquariumFish(), FishAction by PrintingFishAction("eat algae"), FishColor by fishColor

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(private val food: String) : FishAction {
    override fun eat() {
        println("eat algae")
        println(food)
    }
}
