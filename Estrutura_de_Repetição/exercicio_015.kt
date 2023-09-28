/*15. A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo. */

fun main(){

    var n = 0;
    var num1 = 0
    var num2 = 1
    var num3 = 0

    print("Informe ate qual termo deseja calcular: ")
    n = readLine()!!.toInt()

    for(i in 1..n){

        num3 = num1 + num2
        num1 = num2
        num2 = num3

        print("$num1 ")
    }

    return
}