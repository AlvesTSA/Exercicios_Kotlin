/*4. Leia uma matriz 4 x 4 e troque os valores da 1ª.linha pelos da 4ª.coluna, vice-e-versa. Escrever ao final a matriz obtida */

import kotlin.random.Random

fun main(){

    var size = 4
    var max = 9
    var min = 1
    var matriz = Array(size){Array(size){0}}
    var temp: Int

    for (i in 0 until size){
    
        for (j in 0 until size){
        
            matriz[i][j] = Random.nextInt(min,max)
        }
    }
    
    println("Matriz lida: ")

    for (i in 0 until size){
    
        for (j in 0 until size){
            
            print("${matriz[i][j]} ")
        }
        println()
    }

    for (i in 0 until size){
    
        temp = matriz[0][i]
        matriz[0][i] = matriz[i][3]
        matriz[i][3] = temp
    }

    println("Matriz invertida: ")

    for (i in 0 until size){
    
        for (j in 0 until size){
        
            print("${matriz[i][j]} ")
        }
        println()
    }
    return
}