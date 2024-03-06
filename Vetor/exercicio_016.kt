/*16. Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus vendedores com base em comissões. O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana. Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000, ou seja, um total de $470. Escreva um programa (usando um array de contadores) que determine quantos vendedores receberam salários nos seguintes intervalos de valores:

 a. $200 - $299 

 b. $300 - $399 

 c. $400 - $499

 d. $500 - $599

 e. $600 - $699
 
 f. $700 - $799
 
 g. $800 - $899

 h. $900 - $999

 i. $1000 em diante

Desafio: Crie ma fórmula para chegar na posição da lista a partir do salário, sem fazer vários ifs aninhados.*/

fun main(){

    var contador = IntArray(9) {0}
    var taxa_comiss = 0.09F
    
    for (i in 0 until 100) {
        
        print("Informe a o valor de venda do vendedor ${i + 1}: ")
        var venda = readLine()!!.toFloat()

        if (venda == -1f){
            
            break
        }

        var salario = (venda*taxa_comiss) + 200f
        salario /= 100f

        if(salario >= 10f){

            contador[8]++
        }
        else{
            var faixa = salario.toInt() 
            contador[faixa - 2]++
        }
        
    }

    println("a. $200 - $299: ${contador[0]} vendedores")
    println("b. $300 - $399: ${contador[1]} vendedores")
    println("c. $400 - $499: ${contador[2]} vendedores")
    println("d. $500 - $599: ${contador[3]} vendedores")
    println("e. $600 - $699: ${contador[4]} vendedores")
    println("f. $700 - $799: ${contador[5]} vendedores")
    println("g. $800 - $899: ${contador[6]} vendedores")
    println("h. $900 - $999: ${contador[7]} vendedores")
    println("i. $1000 em diante: ${contador[8]} vendedores")

    return
}
