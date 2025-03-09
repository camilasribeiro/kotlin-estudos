package passo5.enquantocomflag

fun main() {
    var continuar = true
    var numero = 0
    var soma = 0
    while (continuar) {
        soma += numero
        println("Digite um número: ")
        numero = readln().toInt()
        if (numero == 1111) {
            continuar = false
        }
    }
    println("A soma de todos os números digitados é $soma")
}