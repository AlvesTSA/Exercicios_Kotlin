/* Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato. */

fun main(){

    val produto_a: Float
    val produto_b: Float
    val produto_c: Float
    val barato: Float

    println("Informe o preço de três produtos: ")
    produto_a = readLine()!!.toFloat()
    produto_b = readLine()!!.toFloat()
    produto_c = readLine()!!.toFloat()

    if(produto_a < produto_b && produto_a < produto_c){

        barato = produto_a
    }
    else if(produto_b < produto_a && produto_b < produto_c){

        barato = produto_b
    }
    else{

        barato = produto_c
    }
    
    println("O mais barato: $barato")

}