/*Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
 
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
*/

fun main(){

    var nota100 = 0
    var nota50 = 0
    var nota10 = 0
    var nota5 = 0
    var nota1 = 0
    var valor_saque = 0

    println("Informe um valor de saque de ate 600 reais:")
    valor_saque = readLine()!!.toInt()

    if(valor_saque > 0 && valor_saque <= 600){

        nota100 = valor_saque / 100
        valor_saque %= 100
        nota50 = valor_saque / 50
        valor_saque %= 50 
        nota10 = valor_saque / 10
        valor_saque %= 10 
        nota5 = valor_saque / 5
        valor_saque %= 5
        nota1 = valor_saque 
    }
    else{

        println("Informe um valor de saque válido")

        return
    }

    println("Nota de 100: $nota100\nNota de 50: $nota50\nNota de 10: $nota10\nNota de 5: $nota5\nNota de 1: $nota1\n")
}