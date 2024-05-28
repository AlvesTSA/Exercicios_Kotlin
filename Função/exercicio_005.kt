/*5. Faça uma função que recebe por parâmetro o tempo de duração de uma fábrica expressa em segundos e retorna também por parâmetro esse tempo em horas, minutos e segundos.*/

fun main()
{
    print("Informe o tempo em segundos: ");
    var t_em_s = readLine()!!.toInt()

    val tempo = converteTempo(t_em_s)

    println(String.format("Horas: %d",tempo.horas))
    println(String.format("Minutos: %d", tempo.minutos))
    println(String.format("Segundos: %d", tempo.segundos))

    return
}

data class Tempo(val horas:Int, val minutos:Int, val segundos:Int)

fun converteTempo(tempo_em_segundos: Int):Tempo
{
    val horas = tempo_em_segundos / 3600;  // Calcula o número de horas
    val minutos = (tempo_em_segundos % 3600) / 60;  // Calcula o número de minutos
    val segundos = tempo_em_segundos % 60;  // Calcula os segundos restantes

    return Tempo(horas,minutos,segundos)
}