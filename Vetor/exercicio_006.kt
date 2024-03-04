/*6. Leia um vetor de 20 posições e atribua valor 0 para todos os elementos que possuírem valores negativos.*/

fun main(){

    var vetor = IntArray(20)

    println("Informe 20 numeros inteiros:")

    for(i in 0 until 20){

        vetor[i] = readLine()!!.toInt()

        if(vetor[i] < 0){

            vetor[i] = 0
        }
    }

    print("Valores lidos e corrigidos com 0: ")

    for(i in 0 until 20){

        print("${vetor[i]} ")
    }

    return
}