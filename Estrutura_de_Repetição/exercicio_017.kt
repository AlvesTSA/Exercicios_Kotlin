/*17. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 */

fun main(){

    var num:Int
    var fatorial:Int

    print("Informe o número que se deseja calcular o fatorial: ")
    num = readLine()!!.toInt()
    fatorial = num
    
    print("$num! = $num")

    for(i in 1..num - 1){

        num--
        fatorial *= num

        print(" x $num")
    }

    print(" = $fatorial")

    return

}