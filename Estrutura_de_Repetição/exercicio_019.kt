/*19. . Altere o programa anterior para que ele aceite apenas números entre 0 e 1000. */

fun main(){

    var n:Int
    var num:Int
    var menor:Int
    var maior:Int
    var soma:Int

    print("Informe quantos números deseja atribuir: ")
    n = readLine()!!.toInt()
    println("Informe o conjunto de números: ")

    do{
        num = readLine()!!.toInt()

        if(num <= 0 || num >= 1000){

            println("Error: o número deve ser entre 0 e 1000.")
        }
    }while(num <= 0 || num >= 1000)
    
    maior = num
    menor = num
    soma = num
    
    for(i in 1..n -1){

        do{
            num = readLine()!!.toInt()
    
            if(num <= 0 || num >= 1000){
    
                println("Error: o número deve ser entre 0 e 1000.")
            }
        }while(num <= 0 || num >= 1000)
        
        soma += num

        if(num > maior){

            maior = num
        }
        else if(num < menor){

            menor = num
        }
    }
    println("Maior: $maior\nMenor: $menor\nSoma: $soma")

    return
}