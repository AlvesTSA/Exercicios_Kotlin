/*12. Foram anotadas as idades e alturas de 10 alunos. Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.*/

fun main(){

    var idade = IntArray(10)
    var altura = FloatArray(10)
    var media = 0.0

    for (i in 0 until 10) {
        
        println("Informe a idade do aluno ${i + 1}: ")
        idade[i] = readLine()!!.toInt()
        println("Informe a altura do aluno ${i + 1}: ")
        altura[i] = readLine()!!.toFloat()
        
        media += altura[i]
    }

    media /= 10.0
    var count = 0

    for (i in 0 until 10) {
        
        if (idade[i] > 13 && altura[i] < media) {
            
            count++;
        }
    }

    println("alunos com mais de 13 anos com altura inferior a media: ${count}")

    return
}