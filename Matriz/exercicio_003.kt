/*3. Leia uma matriz 20 x 20. Leia também um valor X. O programa deverá fazer uma busca desse valor na matriz e, ao final escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”. */

import kotlin.random.Random

fun main(){

    var size = 20
    var intervalo_max = 1000
    var intervalo_min = 0
    var matriz = Array(size){Array(size){0}}  
    var loc = IntArray(2)
    var count = 0

    print("Informe um valor de x: ");
    var x = readLine()!!.toInt()

    for (i in 0 until size){
        
        for (j in 0 until size){
            
            matriz[i][j] = Random.nextInt(intervalo_min,intervalo_max) 
        }
    }

    for (i in 0 until size){
        
        for (j in 0 until size){
        
            if (matriz[i][j] == x){
                
                loc[0] = i;
                loc[1] = j;

                println("Valor encontrado\nlinha: ${loc[0]}\nColuna: ${loc[1]}")
                count++;
            } 
        }
    }

    if (count == 0){
        
        println("Valor nao encontrado")
    }

    return
}