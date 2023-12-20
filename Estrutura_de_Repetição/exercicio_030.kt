/*30. O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:

Preço do pão: R$ 0.18 

Panificadora Pão de Ontem - Tabela de preços 

1 - R$ 0.18

2 - R$ 0.36

...

50 - R$ 9.00 */

fun main() {
    var soma: Float = 0f // Inicializando soma com zero
    var preco: Float

    print("Informe o preço da unidade de pão: ")
    preco = readLine()!!.toFloat()
    println("Panificadora Pão de Ontem - Tabela de preços")

    for (i in 1..50) {
        
        soma += preco
        println("$i - R$ $soma")
    }

    return
}
