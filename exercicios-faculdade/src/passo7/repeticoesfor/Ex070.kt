package passo7.repeticoesfor

fun main() {
    var f0 = 1
    var f1 = 1

    println("F(0) = $f0")
    println("F(1) = $f1")

    for (i in 3..10) {
        var calculo = f0 + f1
        println("F($i) = F(${i-1}) + F(${i-2}) = $f1 + $f0 = $calculo")
        f0 = f1
        f1 = calculo
    }
}

//[DESAFIO] Faça um programa que mostre os 10 primeiros elementos
//da Sequência de Fibonacci:
//
//1 1 2 3 5 8 13 21...