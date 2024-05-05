/*1. Leia uma matriz 3 x 3 e escreva a localização (linha e a coluna) do maior valor.*/


fun main(){

    var size = 3
    var matriz = Array(size){Array(size){0}}
    var maior = 0
    var linha  = 0
    var coluna = 0

    println("Informe uma matriz $size x $size: ")

    for(i in 0 until 3){

        for(j in 0 until 3){

            matriz[i][j] = readLine()!!.toInt()
        }
    }

    for(i in 0 until 3){

        for(j in 0 until 3){

            if(matriz[i][j] > maior){

                maior = matriz[i][j]
                linha = i + 1
                coluna = j + 1
            }
        }
    }

    println("Maior valor: $maior")
    println("Localização: \nLinha: $linha\nColuna: $coluna")

    return
}