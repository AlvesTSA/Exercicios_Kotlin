/*25. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada. */

fun main(){

    var n: Int
    var soma: Float
    var media: Float 
    var idade: Float
    soma = 0f

    print("Informe quantas pessoas deseja coletar a idade: ")
    n = readLine()!!.toInt()

    for(i in 1..n){

        print("Informe a idade da pessoa $i: ")
        idade = readLine()!!.toFloat()

        soma += idade
    }

    media = soma/n.toFloat()

    if(media > 0 && media <= 25){

        println("Turma jovem")
    }
    else if(media >= 26 && media <= 60){

        println("Turma adulta")
    }
    else{

        println("Turma idosa")
    }
    

    return

}