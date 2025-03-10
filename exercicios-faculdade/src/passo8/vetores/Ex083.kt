package passo8.vetores

import kotlin.random.Random

fun main() {
    var numerosAleatorios = Array<Int> (20) {0}

     var computador = 0

    println("Números gerados: ")
    for (i in 0..19) {
        computador = Random.nextInt(0, 100)
        numerosAleatorios[i] = computador
        println(computador)
    }
    var ordemCrescente = numerosAleatorios.sort()
    println("Números na ordem crescente: ")
    for (numero in numerosAleatorios) {
        print("$numero ")
    }
}