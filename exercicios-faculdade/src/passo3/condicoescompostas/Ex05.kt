package passo3.condicoescompostas

fun main() {
    print("Digite o tamanho do primeiro segmento: ")
    val segmentoA = readln().toInt()

    print("Digite o tamanho do segundo segmento: ")
    val segmentoB = readln().toInt()

    print("Digite o tamanho do terceiro segmento: ")
    val segmentoC = readln().toInt()

    if ((segmentoA + segmentoB) > segmentoC && (segmentoA + segmentoC) > segmentoB && (segmentoB + segmentoC) >
        segmentoA) {
        if ((segmentoA == segmentoB) && (segmentoB == segmentoC)) {
            println("É possível formar um triângulo equilátero.")
        } else if ((segmentoA == segmentoB) || (segmentoA == segmentoC) || (segmentoB == segmentoC)) {
            println("É possível formar um triângulo isósceles.")
        } else {
            println("É possível formar um triângulo escaleno.")
        }
    } else {
        println("Não é possível formar um triângulo!")
    }
}