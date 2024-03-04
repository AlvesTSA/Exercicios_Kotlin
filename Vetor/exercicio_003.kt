/*3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.*/

fun main(){

    var notas = FloatArray(4)
    var media = 0.0

    println("Informe as 4 notas:")

    for(i in 0 until 4){

        notas[i] = readLine()!!.toFloat()

        media += notas[i]
    }

    media /= 4.0
    print("Notas: ")

    for(i in 0 until 4){

        print("${notas[i]} ")
    }

    println("\nMedia: ${media}")

    return
}