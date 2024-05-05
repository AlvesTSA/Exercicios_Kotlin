/*6. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao final a matriz obtida.*/

fun main(){

    var size = 5
    var matriz = Array(size){Array(size){0}}

    for (i in 0 until size){
    
        for (y in 0 until size){
            
            if(i == y){

                matriz[i][y] = 1
            }
            else{

                matriz[i][y] = 0
            }
        }
    }

    println("Matriz resultante:")
    
    for (i in 0 until size){
        
        for (y in 0 until size){
            
            print("${matriz[i][y]} ")
        }

        println()
    }

    return
}