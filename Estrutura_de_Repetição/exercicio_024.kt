/*24. Faça um programa que calcule o mostre a média aritmética de N notas. */

fun main(){

    var n: Int
    var soma: Float
    var media: Float 
    var nota: Float
    soma = 0f

    print("Informe quantas notas deseja calcular: ")
    n = readLine()!!.toInt()

    for(i in 1..n){

        print("Informe a nota $i: ")
        nota = readLine()!!.toFloat()

        soma += nota
    }

    media = soma/n.toFloat()

    println("Media: $media")

    return

}