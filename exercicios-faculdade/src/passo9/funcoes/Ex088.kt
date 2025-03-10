package passo9.funcoes

fun main() {
    exibirFrase("Aprendendo Portugol", 3)
}

fun exibirFrase(frase : String, contador: Int) {
    val totalSpaces = (frase.length/3)
    var linha = "+ ${" ".repeat(frase.length/2)} ======= ${" ".repeat(frase.length/2)} +"
    println(linha)
    repeat(contador) {
        frase.chunked(3).forEach{
            println(it)
        }
    }
    println(linha)
}