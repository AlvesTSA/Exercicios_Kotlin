/*4. Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume (v = 4/3.P .R3).*/

fun main()
{
    print("Informe o raio da esfera: ")
    var r = readLine()!!.toDouble()

    var v = calc_vol(r)
   
    println(String.format("Volume da esfera: %.2f",v))
    return
}

fun calc_vol( r:Double): Double
{ 
    val pi = 3.14159265358979323846
    val v = (4.0/3.0)*pi*r*r*r

    return v
}