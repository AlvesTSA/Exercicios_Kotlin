/*7. Leia duas matrizes 4 x 4 e escreva uma terceira com os 4 maiores elementos entre as primeiras*/

import kotlin.random.Random

fun main(){

    var size = 4
    var max = 100
    var min = 1
    var matrizA = Array(size){Array(size){0}}
    var matrizB = Array(size){Array(size){0}}
    var maiores = IntArray(size*size + size*size) // Vamos armazenar os maiores valores de ambas as matrizes aqui
    var k = 0 // indice para percorrer o array de maiores valores
    var matrizResultante = Array(size){Array(size){0}}// Matriz para armazenar os 4 maiores valores

    println("Informe os elementos da matriz A:")

    for (i in 0 until size) {
        for (j in 0 until size) {
            matrizA[i][j] = Random.nextInt(min,max)
            maiores[k++] = matrizA[i][j]
            print("${matrizA[i][j]} ")
        }
        println()
    }
    
    println("Informe os elementos da matriz B:")

    for(i in 0 until size) {
        for(j in 0 until size) {
            matrizB[i][j] = Random.nextInt(min,max)
            maiores[k++] = matrizB[i][j]
            print("${matrizB[i][j]} ")
        }
        println()
    }

    // Ordenar os maiores valores em ordem decrescente
    for (i in 0 until (size*size + size*size)) {
        for (j in 0 until (size*size + size*size)) {

            if(maiores[i] > maiores[j]) {
                var temp = maiores[i]
                maiores[i] = maiores[j]
                maiores[j] = temp
            }
        }
    }

    println("Matriz resultante:")
    // Preencher a matriz resultante com os 4 maiores valores
    for(i in 0 until size) {
        for(j in 0 until size){
            matrizResultante[i][j] = maiores[j]
            print("${matrizResultante[i][j]} ")
        }
        println()
    }

    return
}