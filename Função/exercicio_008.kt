/*8. Faça uma função que recebe um valor inteiro e verifica se o valor é par ou ímpar. A função deve retornar um valor booleano*/

fun main()
{
    print("Informe um numero inteiro: ")
    val num = readLine()!!.toInt()

    if (impar_par(num))
    {
        println("O numero informado é PAR")
    }
    else
    {
        println("O numero informado é IMPAR")
    }

    return
}

fun impar_par(numero:Int):Boolean
{
    return numero % 2 == 0
}