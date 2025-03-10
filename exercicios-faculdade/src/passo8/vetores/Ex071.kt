package passo8.vetores

fun main() {
    var numeros = Array (8) {0}

    for (i in 0..7) {
        numeros[i] = 999
        print("${numeros[i]} ")
    }

    println(numeros)

    for (numero in numeros.indices) {
        println("Índice ${numero}: Valor ${numeros[numero]}")
    }
}