/*18. . Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores. */

fun main(){

    var n:Int
    var num:Int
    var menor:Int
    var maior:Int
    var soma:Int

    print("Informe quantos números deseja atribuir: ")
    n = readLine()!!.toInt()

    println("Informe o conjunto de números: ")
    num = readLine()!!.toInt()

    maior = num
    menor = num
    soma = num
    
    for(i in 1..n -1){

        num = readLine()!!.toInt()
        soma += num

        if(num > maior){

            maior = num
        }
        else if(num < menor){

            menor = num
        }
    }
    println("Maior: $maior\nMenor: $menor\nSoma: $soma")

    return
}