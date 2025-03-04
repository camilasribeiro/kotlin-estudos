package passo1.sequenciasbasicas

fun main() {
    print("Quantidade de cigarros fumados por dias: ")
    val quantidadeCigarrosDia = readln().toInt()

    print("Há quantos anos você fuma? ")
    val anosFumando = readln().toInt()

    val minutosPorDia = 1440
    val minutosPerdidosDia = quantidadeCigarrosDia * 10
    val totalMinutosPerdidos =  (anosFumando * 365) * minutosPerdidosDia
    val diasPerdidosVida = totalMinutosPerdidos / minutosPorDia

    println("Você perderá $diasPerdidosVida dias de vida.")
}