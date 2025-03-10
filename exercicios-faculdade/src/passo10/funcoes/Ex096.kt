package passo10.funcoes

fun main() {
    println("Digite a primeira nota: ")
    val numero1 = readln().toInt()

    println("Digite a segunda nota: ")
    val numero2 = readln().toInt()

    media(numero1, numero2)
}

fun media(numero1: Int, numero2: Int){
    var media = (numero1 + numero2) / 2
    println("Média: $media")
}