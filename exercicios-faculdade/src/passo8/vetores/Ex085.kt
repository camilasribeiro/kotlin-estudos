package passo8.vetores

fun main() {

    var nomesFuncionarios = Array<String> (5) {""}
    var sexosFuncionarios = Array<String> (5) {""}
    var salariosFuncionarios = Array<Double> (5) {0.0}

    for (i in 0..4) {
        println("Digite o nome: ")
        var nome = readln()

        println("Digite o salário: R$")
        var salario = readln().toDouble()

        println("Digite o sexo (M/F): ")
        var sexo = readln().uppercase()

        nomesFuncionarios[i] = nome
        sexosFuncionarios[i] = sexo
        salariosFuncionarios[i] = salario
    }

    println("Infomações das funcionárias que ganham mais de R$5OOO,00")
    for (i in 0..4) {
        if (sexosFuncionarios[i] == "F" && salariosFuncionarios[i] > 5000) {
            println("Nome funcionária: ${nomesFuncionarios[i]}")
            println("Salário funcionária: R$${"%.2f".format(salariosFuncionarios[i])}")
        }
    }
}