package passo4.repeticoesenquanto

fun main() {
    print("Valor inicial: ")
    val valorInicial = readln().toInt()

    print("Valor final: ")
    val valorFinal = readln().toInt()

    print("Incremento: ")
    val valorIncremento = readln().toInt()

    print("Contagem: ")

    if (valorInicial < valorFinal) {
        for (i in valorInicial..valorFinal step valorIncremento) {
            print("$i ")
        }
        print("Acabou!")
    } else if (valorInicial > valorFinal) {
        for (i in valorInicial downTo  valorFinal step valorIncremento) {
            print("$i ")
        }
        print("Acabou!")
    } else {
        print("O valor inicial $valorInicial e o valor final $valorFinal são iguais!")
    }
}