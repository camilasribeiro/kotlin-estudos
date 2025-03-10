package passo8.vetores

fun main() {
    var numeros = Array<Int>(15) {0}

    for (i in 0..14) {
        println("Digite o ${i + 1}º número: ")
        var numero = readln().toInt()
        numeros[i] = numero
    }

    println("\nVetor completo: ")
    for (i in 0..14) {
        println("Índice $i: ${numeros[i]}")
    }

    println("\nPosição dos números que são múltiplos de 10: ")
    for (i in 0..14) {
        if (numeros[i] % 10 == 0) {
            println("Índice $i: ${numeros[i]}")
        }
    }
}