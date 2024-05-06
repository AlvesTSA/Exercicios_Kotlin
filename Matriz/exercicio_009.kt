/*9. Leia uma matriz 6 x 6 e atribuir o valor 0 para os valores negativos encontrados fora das diagonais principal e secundaria.*/

import kotlin.random.Random

fun main(){

    var size = 6
    var max = 10
    var min = 0
    var matriz = Array(size){Array(size){0}}

    println("Informe uma matriz $size x $size: ")

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            var num = Random.nextInt(min,max)
            matriz[i][j] = num * -1
        }  
    }

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            if (i != j && j != size - i - 1 && matriz[i][j] < 0){
                
                matriz[i][j] = 0
            }  
        }  
    }

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matriz[i][j]} ")
        } 
        println()
    }
    return
}