package passo8.vetores

fun main() {
    var numeros = Array(10) {0}

    for (i in 0..9) {
        if (i % 2 == 0) {
            numeros[i] = 5
        } else {
            numeros[i] = 3
        }
    }

    for (numero in numeros) {
        print("$numero ")
    }
}