/*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
*/

fun main(){

    var senha = ""
    var nome = ""

    do{

        println("Informe um nome de usuário: ")
        nome = readLine()!!

        println("Informe uma senha: ")
        senha = readLine()!!

        if(nome.equals(senha)){

            println("Erro: o nome de usuário deve ser diferente da senha.")
        }

    }while(nome.equals(senha))

    println("Nome e senha atribuídos com secesso.")
}


