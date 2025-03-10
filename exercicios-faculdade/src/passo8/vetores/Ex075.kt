package passo8.vetores

fun main() {
    var sequenciaFibonacci = Array<Int>(16) {0}

    var f0 = 1
    var f1 = 1

    sequenciaFibonacci[0] = f0
    sequenciaFibonacci[1] = f1

    for (i in 3..16) {
        var calculo = f0 + f1
        sequenciaFibonacci[i - 1] = calculo
        f0 = f1
        f1 = calculo
    }

    for (numero in 0..16) {
        println("Índice ${numero}: Valor: ${sequenciaFibonacci[numero]}")
    }
}