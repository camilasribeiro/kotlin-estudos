package passo3.condicoescompostas

fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readln().toInt()

    print("Digite o segundo número: ")
    val numero2 = readln().toInt()

    if (numero1 > numero2) {
        println("O primeiro número ($numero1) é maior que o segundo número ($numero2)")
    } else if (numero2 > numero1) {
        println("O segundo número ($numero2) é maior que o primeiro número ($numero1)")
    } else {
        println("Não existe valor maior. Os números $numero1 e $numero2 são iguais!")
    }
}