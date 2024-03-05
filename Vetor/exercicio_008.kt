/*8. Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e a altura na ordem inversa a ordem lida.*/

fun main(){

    var altura = FloatArray(5)
    var idade = IntArray(5)

    for(i in 0 until 5){

        print("Informe a idade da pessoa ${i +1}: ")
        idade[i] = readLine()!!.toInt()
        print("Informe a altura da pessoa ${i +1}: ")
        altura[i] = readLine()!!.toFloat()
    }

    println("Vaalores de altura e idade em ordem inversa\n")

    for(i in 4 downTo 0){

        println("Idade da pessoa ${i + 1}: ${idade[i]}")
        println("Altura da pessoa ${i + 1}: ${altura[i]}")
    }

    return
}