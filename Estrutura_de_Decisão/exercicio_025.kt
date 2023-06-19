/*Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).*/

fun main(){

    var idade = 0

    println("Informe sua idade e verifique se pode ser um doador:")
    idade = readLine()!!.toInt()

    if(idade >= 18 && idade <= 67){

        println("Você pode ser doador")
    }
    else{

        println("Você não pode ser doador")
    }
}