/*14. Faça um procedimento que lê 50 valores inteiros e retorna o maior e o menor deles.*/

import kotlin.random.Random

fun main()
{
    println("informe 50 valores inteiros: ")
    
    var mm = maior_menor()

    println(String.format("Maior:%d\nMenor: %d",mm.maior,mm.menor))
}

data class MaiorMenor(var maior:Int, var menor:Int)

fun maior_menor():MaiorMenor
{
    var maior = Integer.MIN_VALUE// Inicializa o maior com o menor valor possível de um inteiro
    var menor = Integer.MAX_VALUE// Inicializa o menor com o maior valor possível de um inteiro
    
    for (i in 0 until 50){
        
        var valores = Random.nextInt(10000) //usado para gerar numeros aleatórios e simular entrada do usuário.

        //valores = readLine()!!.toInt() Aqui, os valores de entrada foram substituidos por uma função que gera números aleatórios

        if (valores > maior)
        {
            maior = valores 
        }
        if (valores < menor)
        {
            menor = valores
        } 
    }

    return MaiorMenor(maior, menor)
}