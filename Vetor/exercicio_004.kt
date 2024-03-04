/*4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.*/

fun main(){

    var vetor = CharArray(10)
    var count = 0

    println("Informe 10 caractere de letras: ")

    for(i in 0 until 10){

        val input = readLine()

        if (input != null && input.isNotEmpty()) {
            
            vetor[i] = input[0]

            if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u' && vetor[i] != 'A' && vetor[i] != 'E' && vetor[i] != 'I' && vetor[i] != 'O' && vetor[i] != 'U') {

                count++
            }
        }
    }
    println("Quantidade de consoantes lidas: ${count}")
    print("Consoantes: ")

    for(i in 0 until 10){

        if (vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && vetor[i] != 'o' && vetor[i] != 'u' && vetor[i] != 'A' && vetor[i] != 'E' && vetor[i] != 'I' && vetor[i] != 'O' && vetor[i] != 'U'){

            print("${vetor[i]} ")
        }
    }

    return
}