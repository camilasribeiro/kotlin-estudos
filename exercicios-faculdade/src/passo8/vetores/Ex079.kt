package passo8.vetores

fun main() {
    var numeros = Array<Int>(10) {0}

    for (i in 0..9) {
        println("Digite o ${i + 1}º número: ")
        var numero = readln().toInt()
        numeros[i] = numero
    }

    println("\nPosição dos números pares: ")
    for (i in 0..9) {
        if (numeros[i] % 2 == 0) {
            println("Índice $i: ${numeros[i]}")
        }
    }
}