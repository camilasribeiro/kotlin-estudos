package passo7.repeticoesfor

fun main() {
    println("Digite um número: ")
    var numero = readln().toInt()

    println("Tabuada do número: $numero")

    for (i in 1..10){
        println("$numero x $i = ${numero * i}")
    }
}