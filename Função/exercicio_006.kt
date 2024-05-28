/*6. Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade expressa em dias.*/

fun main()
{
    print("Informe os anos de sua idade: ")
    val anos = readLine()!!.toInt()
    print("Informe os meses de sua idade: ")
    val meses = readLine()!!.toInt()
    print("Informe os dias de sua idade: ")
    val dias = readLine()!!.toInt()

    val d = transformaIdade(anos,meses,dias)

    println(String.format("Voce tem %d dias de idade.",d))

    return
}

fun transformaIdade(anos:Int,meses:Int,dias:Int):Int
{
    return anos * 365 + meses * 30 + dias
}