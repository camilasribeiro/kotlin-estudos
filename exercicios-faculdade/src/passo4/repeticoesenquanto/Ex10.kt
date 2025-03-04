package passo4.repeticoesenquanto

fun main() {
    print("Valor inicial: ")
    val valorInicial = readln().toInt()

    print("Valor final: ")
    val valorFinal = readln().toInt()

    print("Incremento: ")
    val valorIncremento = readln().toInt()

    print("Cálculo: ")

    var soma = 0

    for (i in valorInicial downTo valorFinal step valorIncremento) {
        if (i == valorFinal) {
            print("$i ")
        } else {
            print("$i + ")
        }
        soma += i
    }
    println("\nSoma: $soma")
}