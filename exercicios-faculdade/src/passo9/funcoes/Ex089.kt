package passo9.funcoes

fun main() {
    fraseComBorda("Aprendendo Portugol", 3, 2)
}

fun fraseComBorda(mensagem: String, borda: Int, contador: Int){
    var linha:String = ""

    when(borda){
        1 -> {
            linha = "+ ${"-".repeat(mensagem.length/4)}${"=".repeat(mensagem.length/4)}${"-".repeat(mensagem
                .length/4)} +"
        }
        2 -> {
            linha = "~~${"~".repeat(mensagem.length/4)}${":".repeat(mensagem.length/4)}${"~".repeat(mensagem
                .length/4)}~~"
        }
        3 -> {
            linha = "<<${"<".repeat(mensagem.length/4)}${"-".repeat(mensagem.length/4)}${">".repeat(mensagem
                .length/4)}>>"
        } else->{
        println("Número invalido!")
        println("Criando borda padrão")
        linha = "- ${"-".repeat(mensagem.length)} -"
    }

    }
    println(linha)
    repeat(contador) {
        mensagem.chunked(4).forEach {
            println(it)
        }
    }
    println(linha)
}