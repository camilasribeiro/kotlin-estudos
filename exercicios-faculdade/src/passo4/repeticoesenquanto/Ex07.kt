package passo4.repeticoesenquanto

fun main() {
    print("Valor inicial: ")
    val valorInicial = readln().toInt()

    print("Valor final: ")
    val valorFinal = readln().toInt()

    print("Incremento: ")
    val valorIncremento = readln().toInt()

    print("Contagem: ")

    for (i in valorInicial..valorFinal step valorIncremento) {
        print("$i ")
    }
    print("Acabou!")
}