/*17. Escreva uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o somatório desse valor.*/

fun main()
{
    var n:Int

    do
    {
        print("Informe um valor inteiro: ")
        n = readLine()!!.toInt()

        if (n <= 0) 
        {
            println("Erro: o número deve ser inteiro e positivo.")
        }

    } while (n <= 0)
    
    val soma = somatorio(n)

    println(String.format("Somatório de %d: %d",n,soma))
}

fun somatorio(n:Int):Int
{
    var soma = 0

    for (i in 1..n)
    {
        soma += i
    }
    
    return soma
}