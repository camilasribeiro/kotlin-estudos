package passo3.condicoescompostas

fun main() {
    print("Largura do terreno: ")
    val larguraTerreno = readln().toDouble()

    print("Comprimento do terreno: ")
    val comprimentoTerreno = readln().toDouble()

    val areaTerreno = comprimentoTerreno * larguraTerreno
    println("O terreno possui ${"%.2f".format(areaTerreno)}m²")

    if (areaTerreno > 500) {
        println("Terreno Vip!")
    } else if (areaTerreno < 100) {
        println("Terreno Popular!")
    } else {
        println("Terreno Master!")
    }
}