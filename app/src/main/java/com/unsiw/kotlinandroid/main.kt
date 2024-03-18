package com.unsiw.kotlinandroid

class Main {
    class Aquarium {
        var width: Int = 20
        var height: Int = 40
        var length: Int = 100

        fun printSize() {
            println("Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm ")
        }
    }

    class Main {
        fun buildAquarium() {
            val myAquarium = Aquarium()
            myAquarium.printSize()
            myAquarium.height = 60
            myAquarium.printSize()
        }
    }

    fun main() {
        val app = Main()
        app.buildAquarium()
    }

}