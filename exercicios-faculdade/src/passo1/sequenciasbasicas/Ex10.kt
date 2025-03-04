package passo1.sequenciasbasicas

fun main() {
    print("Largura da parede: ")
    val largura = readln().toDouble()

    print("Altura da parede: ")
    val altura = readln().toDouble()

    val areaPintar = largura * altura
    val quantidadeTinta = areaPintar / 2

    println("Área: ${"%.1f".format(areaPintar)} m²")
    println("Tinta necessária: ${"%.1f".format(quantidadeTinta)} L")
}