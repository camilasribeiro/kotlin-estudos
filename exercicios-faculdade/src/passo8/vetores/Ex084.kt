package passo8.vetores

fun main() {
    var idadePessoas = Array<Int>(9) {0}
    var nomePessoas = Array<String>(9) {""}

    for (i in 0..8) {
        println("Digite o nome: ")
        var nome = readln().uppercase()

        println("Digite a idade: ")
        var idade = readln().toInt()

        idadePessoas[i] = idade
        nomePessoas[i] = nome
    }

    println("\nPessoas menores de idade:")
    for (i in 0 until 9) {
        if (idadePessoas[i] < 18) {
            println("${nomePessoas[i]} - ${idadePessoas[i]} anos")
        }
    }
}