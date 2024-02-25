package id.ac.pnm.ti2b.androidkotlin

fun main(args: Array<String>) {
    biodata("Wisnu", 32)
    hobby("baca buku", "memiliki mindset yang baik dan benar")
}

fun biodata(name:String, age:Int){ // minimal 2 parameter/args
    println("=====================")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("=====================")
}

fun hobby(nama:String, desc:String){
    println("Saya punya hobby $nama")
    println("Dengan itu, saya dapat $desc")
}