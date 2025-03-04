package passo2.condicoesbasicas

fun main() {
    print("Velocidade do carro: ")
    val velocidadeCarro = readln().toInt()

    if (velocidadeCarro > 80) {
        println("Você foi multado!")
        val valorMulta = (velocidadeCarro - 80) * 5
        println("Valor da multa: R$${"%.2f".format(valorMulta.toDouble())}")
    }
}