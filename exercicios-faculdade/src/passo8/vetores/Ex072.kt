package passo8.vetores

var numeros = Array<Int>(10) {0}

fun main() {
    for (indice in 0..9) {
        numeros[indice] = (indice + 1) * 5
        println("Índice ${indice}: Valor ${numeros[indice]}")
    }
}