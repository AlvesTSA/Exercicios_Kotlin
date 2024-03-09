/*24. Leia um vetor de 5 posições contendo os caracteres de um numero. Em seguida escreva esse numero por extenso.*/

fun main(){

    var vetor = IntArray(5)

    for (i in 0 until 5){
        
        print("Informe o carctere ${i + 1}: ")
        vetor[i] = readLine()!!.toInt()
    } 

    print("Numero: ")

    for(i in 0 until 5){
        
        print("${vetor[i]} ")
    }

    return
}