package passo9.funcoes

fun main() {
    println("Digite a quantidade de termos: ")
    val termos = readln().toInt()

    fibonacci(termos)
}

fun fibonacci(numero: Int) {
    val sequenciaFibonacci = Array<Int>(numero) { 0 }

    var f0 = 0
    var f1 = 1

    sequenciaFibonacci[0] = f0
    sequenciaFibonacci[1] = f1

    for (i in 2 until numero) {
        val calculo = f0 + f1
        sequenciaFibonacci[i] = calculo
        f0 = f1
        f1 = calculo
    }

    for (i in 0 until numero) {
        println("Fibonacci(${i + 1}) vai gerar >> ${sequenciaFibonacci[i]}")
    }

    println("FIM")
}
