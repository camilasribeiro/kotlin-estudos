package passo9.funcoes

fun main() {
    exibir("Aprendendo Portugol")
}

fun exibir(frase : String) {
    val totalSpaces = (frase.length/3)
    var linha = "+ ${" ".repeat(frase.length/2)} ======= ${" ".repeat(frase.length/2)} +"
    println(linha)
    println("${" ".repeat(totalSpaces)} ${frase}")
    println(linha)
}