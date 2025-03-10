package passo7.repeticoesfor

import kotlin.math.absoluteValue

fun main() {
    println("Digite um número: ")
    var numero = readln().toInt().absoluteValue

    for (i in 0..numero) {
        print("$i, ")
    }
    print("FIM!")
}