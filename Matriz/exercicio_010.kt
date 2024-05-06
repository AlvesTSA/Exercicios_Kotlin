/*10. Leia uma matriz 50 x 2, onde cada coluna corresponde a um lado de um triangulo retângulo. Declare um vetor que contenha a área dos respectivos triângulos e o escreva.*/

import kotlin.random.Random

fun main(){

    var size_l = 50
    var size_c  = 2
    var max = 10
    var min = 1
    var matriz = Array(size_l){Array(size_c){0}}
    var vetor = FloatArray(size_l)
    var C = 0.5F

    println("Informe uma matriz $size_l x $size_c: ")
    println()

    for (i in 0 until size_l){
        
        for (j in 0 until size_c){
            
            matriz[i][j] = Random.nextInt(min,max)
        }
    }

    print("Matriz lida: \n")
    
    for (i in 0 until size_l){
        
        for (j in 0 until size_c){
            
            print("${matriz[i][j]} ")
        }
        println()
    }

    print("Areas dos triangulos: \n")

    for (i in 0 until size_l){
        
        vetor[i] = matriz[i][0] * matriz[i][1] * C
        print("${vetor[i]} ")
    }
    return
}