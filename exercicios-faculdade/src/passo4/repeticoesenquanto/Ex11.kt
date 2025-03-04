package passo4.repeticoesenquanto

fun main() {
    var soma = 0
    for (i in 1..7) {
        print("Digite o ${i}º número: ")
        val numero = readln().toInt()
        soma += numero
    }
    println("A soma dos números é: $soma")
}