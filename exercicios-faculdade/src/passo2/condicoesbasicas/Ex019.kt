package passo2.condicoesbasicas

fun main() {
    print("Digite seu nome: ")
    val nome = readln()

    print("Digite a primeira nota: ")
    val nota1 = readln().toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readln().toDouble()

    val media = (nota1 + nota2) / 2
    println("${nome}, sua média foi ${media}.")

    if (media > 7) {
        println("Você teve um bom aproveitamento!")
    } else {
        println("Você não teve um bom aproveitamento!")
    }
}