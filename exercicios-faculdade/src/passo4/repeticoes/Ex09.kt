package passo4.repeticoes

fun main() {
    print("Valor inicial: ")
    val valorInicial = readln().toInt()

    print("Valor final: ")
    val valorFinal = readln().toInt()

    print("Incremento: ")
    val valorIncremento = readln().toInt()

    print("Cálculo: ")

    var soma = 0

    for (i in valorInicial..valorFinal step valorIncremento) {
        if (i == valorFinal) {
            print("$i ")
        } else {
            print("$i + ")
        }
        soma += i
    }
    println("\nSoma: $soma")
}