/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:

A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; 

A mensagem "Reprovado", se a média for menor do que sete; 

A mensagem "Aprovado com Distinção", se a média for igual a dez. */

fun main(){

    val nota1: Double
    val nota2: Double
    val media: Double

    println("Informe suas duas notas: ")
    nota1 = readLine()!!.toDouble()
    nota2 = readLine()!!.toDouble()

    media = (nota1 + nota2)/2

    if(media >= 0 && media < 7.0){

        println("REPROVADO !!")
    }
    else if(media >= 7.0 && media < 10.0){

        println("APROVADO !!")

    }
    else if(media == 10.0){

        println("APROVADO COM DISTINÇÃO  !!")
    }
    else{

        println("Nota inválida !!!")
    }

}