/*7. Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou negativo. A função deve retornar um valor booleano.*/

fun main()
{
    print("Informe um valor inteiro: ")
    val num = readLine()!!.toInt()

    if (positivo_negativo(num))
    {
        println("O valor informado é positivo.")
    }
    else
    {
        println("O valor informado é negativo.")
    }
}

fun positivo_negativo(num:Int):Boolean
{
    return num > 0
}