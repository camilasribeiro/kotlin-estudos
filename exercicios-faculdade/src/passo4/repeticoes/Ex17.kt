package passo4.repeticoes

fun main() {
    var pessoas = 0
    var pessoasMais90Kg = 0
    var pessoasMenos50EMenos160 = 0
    var pessoasMais100EMais190 = 0

    val grupoPessoas = mutableListOf<Double>()

    while (pessoas < 7) {
        print("Peso: ")
        val peso = readln().toDouble()

        print("Altura: ")
        val altura = readln().toDouble()

        if (peso < 50 && altura < 1.60) {
            pessoasMenos50EMenos160 += 1
        }
        if (peso > 90) {
            pessoasMais90Kg += 1
        }
        if (peso > 100 && altura > 1.90) {
            pessoasMais100EMais190 += 1
        }

        grupoPessoas.add(altura)
        pessoas += 1
    }

    println("Média de altura do grupo: ${"%.2f".format(grupoPessoas.average())}")
    println("Quantidade de pessoas que pesam mais de 90Kg: $pessoasMais90Kg")
    println("Quantidade de pessoas que pesam menos de 50Kg e medem menos de 1.60m: $pessoasMenos50EMenos160")
    println("Quantidade de pessoas que pesam mais de 100Kg e medem mais de 1.90m: $pessoasMais100EMais190")
}