package passo10.funcoes

fun main() {
    println("Digite a primeira nota: ")
    val numero1 = readln().toInt()

    println("Digite a segunda nota: ")
    val numero2 = readln().toInt()

    val mediaFinal = media(numero1, numero2)
    val resultado = situacao(mediaFinal) //ajustar

    println("Média: $mediaFinal")
    println("Situação: $resultado")
}

fun mediaNotas(numero1: Int, numero2: Int): Double {
    return (numero1 + numero2) / 2.0
}


fun situacao(media: Double): String {
    return when {
        media >= 7 -> "APROVADO"
        media >= 5 -> "EM RECUPERAÇÃO"
        else -> "REPROVADO"
    }
}