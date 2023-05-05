/* Faça um Programa que verifique se uma letra digitada é vogal ou consoante. */

fun main(){

    val letra: Char

    println("Informe uma letra: ")
    letra = readLine()!!.toCharArray()[0]

    if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){

        println("vOGAL")
        
    }
    else{

        println("CONSOANTE")
        
    }
}