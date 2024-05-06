/*12. Leia uma matriz 4 x 4 e verifique se é palíndromo, isto é, sua leitura a partir de qualquer direção sempre apresentara a mesma seqüência.EX.                 SATOR
                    AREPO
                    TENET
                    OPERA
                    ROTAS
                        */

fun main(){

    var size = 4
    var matriz = Array(size){Array(size){' '}}
    var polindromo = false
    
    println("Informe uma matriz tipo char $size x $size: ")

    for (i in 0 until size){
    
        for (j in 0 until size){
        
            matriz[i][j] = readLine()!!.singleOrNull() ?: ' '
        }
    }

    for (i in 0 until size){
    
        for (j in 0 until size){
        
            if (matriz[i][j] != matriz[(size-1) - i][(size - 1) - j]){
                
                polindromo = false

                break
            }
        }
    }

    if (polindromo){
    
        print("Matriz:\n")

        for (i in 0 until size){
    
            for (j in 0 until size){
                
                print("${matriz[i][j]} ")
            }

            println()
        }
        println("A matriz e um polindromo")
    }
    else{

        println("Matriz:")

        for (i in 0 until size){
    
            for (j in 0 until size){
            
                print("${matriz[i][j]} ")
            }

            println()
        }

        println("A matriz nao e polidromo")
    }
    return
}