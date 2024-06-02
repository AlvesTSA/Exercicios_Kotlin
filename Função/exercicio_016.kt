/*16. Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o número de divisores desse valor.*/
fun main()
{
    print("Informe um numero inteiro: ")
    var valor = readLine()!!.toInt()

    var count = divisores(valor)

    println(String.format("O valor informado e divisivel por %d numeros.",count))
}

fun divisores(valor:Int):Int
{
    var count = 0

    for (i in 1..valor)
    {
        var resto = valor % i

        if (resto == 0)
        {
            count++
        }
    }
    
    return count
}