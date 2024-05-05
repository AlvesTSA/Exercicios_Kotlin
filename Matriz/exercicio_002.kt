/*2. Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui.*/

import kotlin.random.Random

fun main(){

    var size = 6
    var min = 1
    var max = 30
    var count = 0
    var matriz = Array(size){Array(size){0}}

    println("Informe uma matriz: ")

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            matriz[i][j] = Random.nextInt(min, max)

            if (matriz[i][j] > 10){
                
                count++
            } 
        }
    }

    println("Matriz lida: ");
    
    for (i in 0 until size){
        
        for (j in 0 until size){
            
            print("${matriz[i][j]} ")
        } 
        println()
    }

    println("Existem $count valores maiores que 10")

    return
}