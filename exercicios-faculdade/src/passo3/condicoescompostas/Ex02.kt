package passo3.condicoescompostas

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readln().toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readln().toDouble()

    val media = (nota1 + nota2) / 2
    println("Média: $media")

    if (media >= 7.0) {
        println("Aprovado!")
    } else if (media >= 5.0 && media <= 6.9) {
        println("Recuperação!")
    } else {
        println("Reprovado!")
    }
}