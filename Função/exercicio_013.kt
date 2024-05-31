/*13. Faça uma função que receba um valor inteiro e positivo e calcula o seu fatorial.*/

fun main()
{
    println("Informe um numero inteiro e positivo: ")

    var fat = calcFatorial()

    println(String.format("%d! = %d",fat.num,fat.fatorial))
}

data class Fatorial(var num:Int,var fatorial:Int)
fun calcFatorial():Fatorial
{
    var fatorial = 1
    var num:Int
    do
    {
        num = readLine()!!.toInt()

        if (num < 0)
        {
            println("ERRO: o numero informado deve ser maior ou igual a zero.")
        }
        
    } while (num < 0)
    
    for (i in 2..num)
    {
        fatorial *= i
    }

    return Fatorial(num,fatorial)
}