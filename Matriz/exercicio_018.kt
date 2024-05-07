/*18. Leia uma matriz 5 x 5 e faça uma troca entre as diagonais superior e inferior. Escreva-a ao final.*/

import kotlin.random.Random

fun main(){

    var size = 5
    var max = 10
    var min = 0
    var matriz = Array(size){Array(size){0}}
    
    for (i in 0 until size){
    
        for (j in 0 until size){
            
            matriz[i][j] = Random.nextInt(min,max)
        }
    }

    println("Matriz original:")
    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matriz[i][j]} ")
        }
        println()
    }
    println()
    var temp:Int
    
    for (i in 0 until size){
        
        for (j in (i + 1) until size){
            
            temp = matriz[i][j]
            matriz[i][j] = matriz[j][i]
            matriz[j][i] = temp
        }
    }

    println("Matriz invertida:")
    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matriz[i][j]} ")
        }
        println()
    }
    return
}