/*3. Faça um programa que leia e valide as seguintes informações:

Nome: maior que 3 caracteres; 

Idade: entre 0 e 150; 

Salário: maior que zero;

Sexo: 'f' ou 'm';

Estado Civil: 's', 'c', 'v', 'd';

*/

fun main(){

    var nome = ""
    var idade = 0
    var salario = 0.0
    var sexo = ' '
    var estado_civil = ' '

    do{

        println("Informe seu nome: ")
        nome = readLine()!!

        if(nome.length < 4){

            println("erro: o nome de usuário não pode ter inferior a 4 caractere.")
        }
    }while(nome.length < 4)

    do{

        println("Informe sua idade: ")
        idade = readLine()!!.toInt()

        if(idade <= 0 || idade >= 150){

            println("erro: a idade deve ser entre 0 e 150 anos.")
        }
    }while(idade <= 0 || idade >= 150)

    do{

        println("Informe seu salário: ")
        salario = readLine()!!.toDouble()

        if(salario <= 0.0){

            println("erro: seu salário deve ser maior que zero.")
        }
    }while(salario <= 0.0)

    do{

        println("Informe seu sexo: ")
        sexo = readLine()!!.toCharArray()[0]

        if(sexo != 'm' && sexo != 'f'){

            println("erro: responda com f ou m.")
        }
    }while(sexo != 'm' && sexo != 'f')

    do{

        println("Informe seu estado civil: ")
        estado_civil = readLine()!!.toCharArray()[0]

        if(estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd'){

            println("erro: responda de ser com s, c, v ou d.")
        }
    }while(estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd')

    println("cadastro realizado com sucesso.")

}