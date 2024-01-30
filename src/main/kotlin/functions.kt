package org.example
fun menu () {
    println("\n=== Menú ===")
    println("1.- Crear un cercle d'un radi determinat i d'un color determinat")
    println("2.- Crear un cercle d'un radi determinat")
    println("3.- Mostrar últim cercle creat")
    println("4.- Mostrar perímetre últim cercle creat")
    println("5.- Mostrar àrea últim cercle creat")
    println("6.- Sortir")
}

fun iniciar_calculo (user: Int, color: String, radi: Float) {
    when(user) {
        1 -> println(Cercle.Cercle(radi, color))
        2 -> println(Cercle.Cercle(radi))
        3 -> println(Cercle.Cercle())
        4 -> Cercle.Cercle().perimetre()
        5 -> println(Cercle.Cercle().area())
        6 -> println("Torni aviat!")
    }
}