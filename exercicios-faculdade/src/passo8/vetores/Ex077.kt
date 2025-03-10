package passo8.vetores

fun main() {
    var nomes = Array<String>(7) {""}

    println("Lista dos nomes digitados: ")
    for (i in 0..6) {
        println("Digite um nome :")
        var nome = readln()

        nomes[i] = nome
    }

    println("Lista dos nomes digitados: ")
    for (nome in nomes){
        println(nome)
    }
}