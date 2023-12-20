/*23. Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos. Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados. */

fun main(){

    var resto: Int
    var divisivel: Int
    var n: Int
    var divisoes: Int
    divisoes = 0

    print("Informe um número inteiro para determinar o intervalo de numeros primos: ")
    n = readLine()!!.toInt()
    print("Primos no intervalo de 1 a $n: ")

    for(i in 1..n){
        
        divisivel = 0

        for(y in 1..i){

            resto = i % y
            divisoes++

            if(resto == 0){
    
                divisivel++
            }
        }
        if(divisivel < 3){
    
            print("$i ")
        }
        
    }
    return
}