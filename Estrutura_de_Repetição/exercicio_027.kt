/*27. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos. */

fun main(){

    var turmas: Int
    var soma: Float
    var media: Float 
    var alunos: Float
    soma = 0f

    print("Informe a quantidade de turmas: ")
    turmas = readLine()!!.toInt()

    for(i in 1..turmas){

        do{

            print("Informe a quantidade de alunos da turma $i: ")
            alunos = readLine()!!.toFloat()

            if(alunos > 40){

                println("erro: a turma não pode ter mais de 40 allunos.")
            }
        }while(alunos > 40)

       
        soma += alunos
    }

    media = soma/turmas.toFloat()

    println("Media: $media")

    return

}