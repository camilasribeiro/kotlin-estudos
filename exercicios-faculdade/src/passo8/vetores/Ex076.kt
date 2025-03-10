package passo8.vetores

import kotlin.random.Random

fun main() {
    var numeros = Array<Int>(7) {0}

    for (i in 0..6) {
        var computador = Random.nextInt(1, 100)
        numeros[i] = computador
        println("Índice $i: Valor: ${numeros[i]}")
    }
}