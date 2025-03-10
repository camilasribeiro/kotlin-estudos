package passo9.funcoes

fun main() {
    helloWorld()
}

fun helloWorld() {
    var hello = "Hello, World!"
    var linha = "+ ${"=".repeat(hello.length)} +"
    println(linha)
    println("  ${hello}  ")
    println(linha)
}