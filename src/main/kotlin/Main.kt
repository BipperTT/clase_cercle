import org.example.menu
import org.example.iniciar_calculo

fun main() {

    menu()

    val user = readInt("Seleccioni una opció:", "ERROR")
    val radi = readFloat("introdueixi el radi", "ERROR")
    val color = readSentence("introdueixi el color", "ERROR")

    iniciar_calculo(user, color, radi)

}