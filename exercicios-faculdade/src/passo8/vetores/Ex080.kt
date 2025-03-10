package passo8.vetores

import kotlin.random.Random

fun main() {
    var numerosSorteados = Array<Int>(30) {0}

    for (i in 0..29) {
        var computador = Random.nextInt(1, 16)
        numerosSorteados[i] = computador
    }

    print("Digite um número: ")
    var numeroEscolhido = readln().toInt()

    var contagem = 0

    for (i in 0..29) {
        if (numerosSorteados[i] == numeroEscolhido) {
            println("Índice $i: $numeroEscolhido")
            contagem++
        }
    }

    if (contagem == 0) {
        println("O número $numeroEscolhido não foi sorteado.")
    } else {
        println("O número $numeroEscolhido foi sorteado $contagem vez(es).")
    }
}