/*19. Leia duas matrizes 10 x 10 e faça uma substituição entre a diagonal inferior da primeira coma diagonal superior da segunda.*/

import kotlin.random.Random

fun main(){

    
    var size = 10
    var max = 10
    var min = 0
    var matrizA = Array(size){Array(size){0}}
    var matrizB = Array(size){Array(size){0}}
    
    for (i in 0 until size){
    
        for (j in 0 until size){
            
            matrizA[i][j] = Random.nextInt(min,max)
            matrizB[i][j] = Random.nextInt(min,max)
        }
    }

    println("Matrizes originais:")
    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matrizA[i][j]} ")
        }
        println()
    }

    println()

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matrizB[i][j]} ")
        }
        println()
    }

    var temp:Int
    
    for (i in 0 until size){
        
        for (j in (i + 1) until size){
            
            temp = matrizA[j][i]
            matrizA[j][i] = matrizB[i][j]
            matrizB[i][j] = temp
        }
    }

    println("Matrizes invertidas:")
    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matrizA[i][j]} ")
        }
        println()
    }

    println()

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matrizA[i][j]} ")
        }
        println()
    }
    return
}