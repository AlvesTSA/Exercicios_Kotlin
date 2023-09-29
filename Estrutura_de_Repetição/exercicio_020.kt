/*20. Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16. */

fun main(){

    var num:Int
    var fatorial:Int
    var op:Int

    do{
        print("Informe o número que se deseja calcular o fatorial: ")

        do{

            num = readLine()!!.toInt()

            if(num <= 0 || num >= 16){

                println("Error: o número deve ser positivo e menor que 16")
            }
        }while(num <= 0 || num >= 16)
        
        fatorial = num
        
        print("$num! = $num")

        for(i in 1..num - 1){

            num--
            fatorial *= num

            print(" x $num")
        }

        println(" = $fatorial")

        println("Informe 1 para continuar ou 0 para sair: ")
        op = readLine()!!.toInt()
    }while(op == 1)
    
    return
}