/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
a)o produto do dobro do primeiro com metade do segundo .
b)a soma do triplo do primeiro com o terceiro.
c)o terceiro elevado ao cubo.
*/

fun main(){

    val num1: Float
    val num2: Float
    val num3: Float
    val a: Float
    val b: Float
    val c: Float

    println("Informe dois números inteiros e um número real: ")
    num1 = readLine()!!.toFloat()
    num2 = readLine()!!.toFloat()
    num3 = readLine()!!.toFloat()

    a = (2*num1)*(num2/2)
    b = (3*num1)+num3
    c = num3*num3*num3

    println("O produto do dobro do primeiro com metade do segundo: $a")
    println("A soma do triplo do primeiro com o terceiro: $b")
    println("o terceiro elevado ao cubo: $c")

}

