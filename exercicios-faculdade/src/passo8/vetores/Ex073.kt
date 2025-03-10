package passo8.vetores

fun main() {
    var numeros = Array<Int>(10) {0}

    for (i in 9 downTo 0) {
        numeros[i] = numeros.size - (i + 1)
        println("Índice ${i}: Valor ${numeros[i]}")
    }
}