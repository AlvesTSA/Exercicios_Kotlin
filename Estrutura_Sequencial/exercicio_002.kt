//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

fun main() {
    
    val num: Float
    
    println("Informe um número qualquer: ")
    num = readLine()!!.toFloat()
    println("O número informado foi: $num ")
}
