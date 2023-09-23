/*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5: 

5 X 1 = 5 

5 X 2 = 10

...

5 X 10 = 50

*/

fun main(){

    var num1 = 0
    var num2 = 0
    var resultado = 0
    
    println("Informe a tabuada que deseja ver: ")
    num1 = readLine()!!.toInt()

    when(num1){

        1 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        2 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        3 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        4 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        5 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        6 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        7 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        8 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        9 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        10 ->{
            println("Tabuada do $num1:")
            
            for (i in 1..10){

                num2++
                resultado = num1*num2

                println("$num1 x $num2 = $resultado")
            }
        }

        else -> println("Erro: informe uma tabuada de 1 a 10")
    }

    return
}