/*5. Leia duas matrizes 20 x 20 e escreva os valores da primeira que ocorrem em qualquer posição da segunda.*/
import kotlin.random.Random

fun main(){

    var size = 20
    var intervalo_max = 1000
    var intervalo_min = 1
    var matrizA = Array(size){Array(size){0}}
    var matrizB = Array(size){Array(size){0}}

    for (i in 0 until size){

        for (j in 0 until size){
        
            matrizA[i][j] = Random.nextInt(intervalo_min,intervalo_max)
            matrizB[i][j] = Random.nextInt(intervalo_min,intervalo_max)
        }
    }
    
    println("Todos os valores da matriz A que estao na matriz B\n");
    
    for (i in 0 until size){
    
        for (j in 0 until size){
        
            for (w in 0 until size){
    
                for (z in 0 until size){
                
                    if (matrizA[i][j] == matrizB[w][z]){
                            
                        print("${matrizA[i][j]} ")
                    } 
                } 
            }
        } 
    }
    return
}