/*11. Leia uma matriz 100 x 10 que se refere respostas de 10 questões de múltipla escolha, referentes a 100 alunos. Leia também um vetor de 10 posições contendo o gabarito de respostas que podem ser a, b, c ou d. Seu programa deverá comparar as respostas de cada candidato com o gabarito e emitir um vetor Resultado, contendo a pontuação correspondente.*/

import kotlin.random.Random

fun main(){

    var size_l = 100
    var size_c = 10
    var respostas = charArrayOf('a', 'b', 'c', 'd')
    var size = respostas.size
    var matriz = Array(size_l){Array(size_c){' '}}
    var gabarito = CharArray(size_c)
    var resultado = IntArray(size_l)
    var count_acerto = IntArray(size_l)

    //Geração do gabarito
    for (i in 0 until size_c){
        
        gabarito[i] = respostas[Random.nextInt(0,size)]
    }

    for (i in 0 until size_l){
        
        println("Respostas do Aluno ${(i+1)}: ")
    
        for (j in 0 until size_c){
            
            matriz[i][j] = respostas[Random.nextInt(0,size)]
            print("${matriz[i][j]} ")
        }
        println()
    }

    for (i in 0 until size_l){
        
        for (j in 0 until size_c){
            
            if (matriz[i][j] == gabarito[j]){
                
                resultado[i] += 10
                count_acerto[i]++
            }
            else{
                
                resultado[i] += 0
            }
        }
    }

    println("\nGabarito: ")

    for (i in 0 until size_c){
        
        print("${gabarito[i]} ")
    }

    println("\n")

    for (i in 0 until size_l){

        println("Resultado do aluno ${(i+1)}: ${count_acerto[i]} acertos e ${resultado[i]} pontos.")  
    }

    return
}