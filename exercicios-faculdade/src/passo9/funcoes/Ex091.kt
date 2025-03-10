package passo9.funcoes

fun main() {
    println("Digite o primeiro número: ")
    val numero1 = readln().toInt()

    println("Digite o segundo número: ")
    val numero2 = readln().toInt()

    maior(numero1, numero2)
}

fun maior(numero1: Int, numero2: Int) {
    var maior = 0

    if (numero1 > numero2) {
        maior = numero1
        println("O número $maior é maior.")
    } else  if (numero2 > numero1){
        maior = numero2
        println("O número $maior é maior.")
    } else {
        println("Os dois números são iguais!")
    }
}