/*23. Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene os resultados em um vetor . Depois, mostre quantas vezes cada valor foi conseguido. Dica: use um vetor de contadores(1-6) e uma função para gerar numeros aleatórios, simulando os lançamentos dos dados.*/

import kotlin.random.Random

fun main(){

    var contador = IntArray(6)

    var random = Random
    
    for (i in 0 until 100){

        var numero = random.nextInt(1, 7)
        contador[numero - 1]++
    }

    for (i in 0 until 6){

        println("Numero ${i + 1}: ${contador[i]} vezes") 
    }

    return

}