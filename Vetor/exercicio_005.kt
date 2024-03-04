/*5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.*/

fun main(){

    var vetor = IntArray(20)
    var count_par = 0
    var count_impar = 0
    var resto = 0

    println("Informe 20 numros inteiros: ")

    for(i in 0 until 20){

        vetor[i] = readLine()!!.toInt()

        resto = vetor[i] % 2

        if(resto == 0){

            count_par++
        }
        else{

            count_impar++
        }
    }

    var par = IntArray(count_par)
    var impar = IntArray(count_impar)
    var y = 0
    var z = 0

    for(i in 0 until 20){

        resto = vetor[i] % 2

        if(resto == 0){

            par[y] = vetor[i]
            y++
        }
        else{

            impar[z] = vetor[i]
            z++
        }
    }

    print("valores lidos: ")

    for(i in 0 until 20){

        print("${vetor[i]} ")
    }

    print("\nvalores par: ")

    for(i in 0 until count_par){

        print("${par[i]} ")
    }

    print("\nvalores impar: ")
    
    for(i in 0 until count_impar){

        print("${impar[i]} ")
    }

    return
}