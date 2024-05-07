/*17. Leia uma matriz 8 x 8 e a transforme numa matriz triangular inferior , atribuindo zero a todos os elementos acima da diagonal principal, escrevendo-a ao final.*/

import kotlin.random.Random

fun main(){

    var size = 8
    var max = 10
    var min = 0
    var matriz = Array(size){Array(size){0}}

    for (w in 0 until size){
    
        for (z in 0 until size){
            
            matriz[w][z] = Random.nextInt(min,max)
        }
    }

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            if (j > i){
                
                matriz[i][j] = 0
            }
            
            print("${matriz[i][j]} ")
        }
        println()
    }  
    return   
}