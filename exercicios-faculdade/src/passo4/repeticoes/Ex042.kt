package passo4.repeticoes

fun main() {
    print("Digite um número: ")
    val numeroInteiro = readln().toInt()

    print("Contagem: ")
    for (i in 1..numeroInteiro) {
        print("$i ")
    }
    print("Acabou!")
}