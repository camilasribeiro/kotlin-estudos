package passo5.enquantocomflag

fun main() {
    var totalSalarioHomens = 0.0
    var totalSalarioMulheres = 0.0
    var continuar = true

    while (continuar) {
        println("Salário do funcionário: R$")
        var salarioFuncionario = readln().toDouble()

        println("Digite o sexo do funcionário ('F' para feminino ou 'M' para masculino):")
        var sexoFuncionario = readln().uppercase()

        if (sexoFuncionario == "M") {
            totalSalarioHomens += salarioFuncionario
        } else {
            totalSalarioMulheres += salarioFuncionario
        }

        println("Deseja continuar? Digite 'S' para sim ou 'N' para não: ")
        var decisao = readln().uppercase()

        if (decisao == "N") {
            continuar = false
        }
    }
    println("Total de salário pago para homens: R$${"%.2f".format(totalSalarioHomens)}")
    println("Total de salário pago para mulheres: R$${"%.2f".format(totalSalarioMulheres)}")
}