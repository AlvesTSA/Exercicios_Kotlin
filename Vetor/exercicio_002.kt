/*2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.*/

fun main(){

    val vetor = IntArray(10)

    println("Informe 10 numeros inteiros: ")

    for(i in 0..9){

        vetor[i] = readLine()!!.toInt()
    }

    println("Numeros lidos e apresentados na ordem inversa: ")

    for(i in 9 downTo 0){

        print("${vetor[i]} ")
    }

    return
}