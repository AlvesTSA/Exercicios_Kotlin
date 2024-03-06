/*14. Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?" 

"Esteve no local do crime?" 

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/

fun main(){

    var resposta = Array<String>(5) { "" }
    var s = 0

    println("Responda as perguntas com s para sim e n para nao\n")
    println("Telefonou para a vítima?")
    resposta[0] = readLine()!!
    println("Esteve no local do crime?")
    resposta[1] = readLine()!!
    println("Mora perto da vítima?")
    resposta[2] = readLine()!!
    println("Devia para a vítima?")
    resposta[3] = readLine()!!
    println("Já trabalhou com a vítima?")
    resposta[4] = readLine()!!

    for (i in 0 until 5) {
            
        if (resposta[i] .equals("s") || resposta[i] .equals("S") ){
            
            s++;
        }
    }

    if (s == 2) {
            
        println("Suspeita")
    }
    else if (s > 2 && s < 5) {

        println("Cumplice")
    }
    else if (s == 5) {

        println("Assassino")
    }
    else{

        println("Inocente")
    }

    return
}