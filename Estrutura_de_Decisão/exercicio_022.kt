/* Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
“Telefonou para a vítima? “ 
“Esteve no local do crime?” 
“Mora perto da vítima? “
“Devia para a vítima? “
“Já trabalhou com a vítima? “
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“. Caso contrário, ele será classificado como “Inocente“.*/

fun main(){

    var contador = 0
    var resposta1: Char
    var resposta2: Char
    var resposta3: Char
    var resposta4: Char
    var resposta5: Char 

    println("Responda 's' para sim e 'n' para nao.\nTelefonou para a vítima?")
    resposta1 = readLine()!!.toCharArray()[0]
    println("Esteve no local do crime?")
    resposta2 = readLine()!!.toCharArray()[0]
    println("Mora perto da vítima?")
    resposta3 = readLine()!!.toCharArray()[0]
    println("Devia para a vítima?")
    resposta4 = readLine()!!.toCharArray()[0]
    println("Já trabalhou com a vítima?")
    resposta5 = readLine()!!.toCharArray()[0]

    if(resposta1 == 's'){

        contador ++
    }
    if(resposta2 == 's'){

        contador ++    
    }
    if(resposta3 == 's'){

        contador ++
    }
    if(resposta4 == 's'){

        contador ++   
    }
    if(resposta5 == 's'){

        contador ++   
    }

    if(contador == 2){

        println("Suspeito")
    }
    else if(contador >= 3 && contador <= 4){

        println("Cumplice")
    }
    else if(contador == 5){

        println("Culpado")
    }
    else{

        println("Inocente")
    }
}