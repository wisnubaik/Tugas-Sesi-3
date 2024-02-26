package id.ac.pnm.ti2b.androidkotlin.com.unsiw.kotlinandroid

fun main(args : Array<String>) {
    biodata("Wisnu", 5)
    hobby("bikin lagu ama baca buku", "bisa nuangin apa yg dirasain gitu loh,sama memperbaiki pola pikir yang salah serta meningkatkannya")
}
fun biodata(name:String, age:Int) {
    println("+++++++++++")
    println("Nama\t: $name")
    println("Usia\t: $age")
    println("+++++++++++")
}
fun hobby(nama:String, desc:String) {
    println("saya punya hobby $nama")
    println("saya ngelakuin sebab itu $desc")
}