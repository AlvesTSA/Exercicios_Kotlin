/*8. Leia uma matriz 8x 8 e escreva o maior elemento da diagonal principal e a soma dos elementos da diagonal secundaria.*/

import kotlin.random.Random

fun main(){

    var size = 8
    var max = 100
    var min = 0
    var matriz = Array(size){Array(size){0}}
    var maior:Int

    println("Informe uma matriz $size x $size: ")

    for(i in 0 until size){
        
        for(y in 0 until size){
            
            matriz[i][y] = Random.nextInt(min,max)
        }
    }

    //maior valor da diagonal principal
    maior = matriz[0][0]

    for(i in 0 until size){
        
        if(matriz[i][i] > maior){
            
            maior = matriz[i][i]
        }
    }
    
    //soma da diagonal secundária
    var soma = 0
    var j = size - 1

    for (i in 0 until size){
        
        soma += matriz[i][j]
        j--
    }
    
    print("\nMatriz lida:\n")

    for (i in 0 until size){
        
        for (y in 0 until size){
            
            print("${matriz[i][y]} ")
        
        }
        println()
    }

    print("Diagonal principal: ")

    for (i in 0 until size){
        
        print("${matriz[i][i]} ")
    }

    print("\nMaior valor da diagonal principal: $maior")
    print("\nDiagonal secundaria: ")
    j = size - 1

    for (i in 0 until size){
        
        print("${matriz[i][j]} ")
        j--
    }

    print("\nSoma da diagonal secundaria: " + soma)

    return
}