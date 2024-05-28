/*1. Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.*/

fun main()
{
    print("Informe um número inteiro: ")
    var num = readLine()!!.toInt()

    var resposta = positivoNegativo(num)

    println("O valor informado é $resposta")

    return
}

fun positivoNegativo(num: Int): Char
{
    if (num > 0)
    {
        return 'P'
    }
    else
    {
        return 'N'
    }          
}