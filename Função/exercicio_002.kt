/*2. Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto. A função “altera” o valor de custo para incluir o imposto sobre vendas.*/

fun main()
{
    print("Informe o a taxa de imposto: ")
    var taxaImposto = readLine()!!.toFloat()
    print("Informe o custo do preoduto: ")
    var custo = readLine()!!.toFloat()

    var custo_final = somaImposto(taxaImposto,custo)

    println("Valor do produto com imposto: " + custo_final)
    return
}

fun somaImposto(taxaImposto:Float, custo:Float): Float
{
    return custo + (custo*(taxaImposto / 100))
}