/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:

A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 

A mensagem "Reprovado", se a média for menor do que sete; 

A mensagem "Aprovado com Distinção", se a média for igual a dez. */

fun main(){

    val nota1: Float
    val nota2: Float
    val media: Float

    println("Informe suas duas notas: ")
    nota1 = readLine()!!.toFloat()
    nota2 = readLine()!!.toFloat()

    media = (nota1 + nota2)/2

    if(media >= 0 && media < 7){

        println("REPROVADO !!")
    }
    else if(media >= 7 && media < 10){

        println("APROVADO !!")

    }
    else if(media == 10){

        println("APROVADO COM DISTINÇÃO  !!")
    }
    else{

        println("Nota inválida !!!")
    }

}