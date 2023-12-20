/*22. Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais número ele é divisível. */

fun main(){

    var num: Int
    var resto: Int
    var divisivel: Int
    divisivel = 0

    print("Informe um número inteiro: ")
    num = readLine()!!.toInt()

    for(i in 1..num){

        resto = num % i

        if(resto == 0){

            divisivel++
        }
    }
    if(divisivel > 2){

        println("Primo: não")

        for(i in 1..num){

            resto = num % i
    
            if(resto == 0){
    
                print("$i ")
            }
        }

    }
    else{

        println("Primo: sim")
    }

    return
}