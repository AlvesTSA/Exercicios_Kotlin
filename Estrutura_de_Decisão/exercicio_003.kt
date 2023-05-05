/* Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

fun main(){

    val letra: Char

    println("Informe uma letra M ou F: ")
    /*.toCharArray()[0] após readLine()!!, para que seja capturado somente o primeiro caractere digitado pelo usuário, e assim convertido em Char.  */
    letra = readLine()!!.toCharArray()[0]

    if(letra == 'M'||  letra == 'm') {

        println("Masculino")
    }
    else if(letra == 'F' ||  letra == 'f' ){

        println("Feminino")
        
    }
    else{

        println("Sexo inválido !!")

    }
}