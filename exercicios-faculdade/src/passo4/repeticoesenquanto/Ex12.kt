package passo4.repeticoesenquanto

fun main() {
    var pares = 0
    var impares = 0
    for (i in 1..6) {
        print("Digite o ${i}º número: ")
        val numero = readln().toInt()
        if (numero % 2 == 0) {
            pares += 1
        } else {
            impares += 1
        }
    }
    println("$pares números são pares")
    println("$impares números são ímpares")
}