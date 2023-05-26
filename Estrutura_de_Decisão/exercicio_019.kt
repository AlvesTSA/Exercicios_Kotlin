/*Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.*/

import kotlin.system.exitProcess

fun main(){

    val num1 : Int
    val num2 : Int
    val resultado : Int
    val op : Int

    println("Informe dois números: ")
    num1 = readLine()!!.toInt()
    num2 = readLine()!!.toInt()
    println("Escolha a operação\n\n[1]Adição\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n")
    op = readLine()!!.toInt()

    when (op){

     1 -> resultado = num1 + num2
    
     2 -> resultado = num1 - num2
    
     3 -> resultado = num1*num2

     4 -> if(num2 == 0){

            println("Não existe divisão por zero.")
            
            return

        }
        else{

            resultado = num1/num2

        }
    
    else -> {
            println("Informe uma opção válida.")
        
            return
        }
         
    }
    if(resultado % 2 == 0){

        if(resultado > 0){

            println("Resultado: $resultado é par e positivo.")

        }
        else if(resultado == 0){

            println("Resultado: $resultado é par e neutro.")

        }
        else{

            println("Resultado: $resultado é par e negativo.")
        }
    }
    else{

        if(resultado < 0){

            println("Resultado: $resultado é impar e negativo.")
        }
        else{

            println("Resultado: $resultado é impar e positivo.")
        }
    } 
}