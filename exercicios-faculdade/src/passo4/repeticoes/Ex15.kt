package passo4.repeticoes

fun main() {
    var contador = 1
    var pessoasMais18 = 0
    var pessoasMenos5 = 0
    var grupoPessoas = mutableListOf<Int>()


    while (contador <= 10) {
        print("Digite a ${contador}ª idade: ")
        var idade = readln().toInt()
        grupoPessoas.add(idade)

        if (idade > 18) {
            pessoasMais18 += 1
        } else if (idade < 5) {
            pessoasMenos5 += 1
        }
        contador ++
    }

    println("Média de idade do grupo: ${grupoPessoas.average()}")
    println("Pessoas com mais de 18 anos: $pessoasMais18")
    println("Pessoas com menos de 5 anos: $pessoasMenos5")
    println("Maior idade: ${grupoPessoas.max()}")
}