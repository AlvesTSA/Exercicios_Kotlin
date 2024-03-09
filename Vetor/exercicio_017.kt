/*17. Em uma competição de salto em distância cada atleta tem direito a cinco saltos. O resultado do atleta será determinado pela média dos cinco valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe o nome, os saltos e a média dos saltos. O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser conforme o exemplo abaixo:

Atleta: Rodrigo Curvêllo
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m


Resultado final:
Atleta: Rodrigo Curvêllo
Saltos: 6.5 - 6.1 - 6.2 - 5.4 - 5.3
Média dos saltos: 5.9 m*/

fun main(){

    var saltos = FloatArray(5)
    
    while (true){
        
        print("\nAtleta: ")
        var nome = readLine()!!

        if (nome.equals("sair")){
            break
        }

        print("Primeiro salto: ")
        saltos[0] = readLine()!!.toFloat()
        print("Segundo salto: ")
        saltos[1] = readLine()!!.toFloat()
        print("Terceiro salto: ")
        saltos[2] = readLine()!!.toFloat()
        print("Quarto salto: ")
        saltos[3] = readLine()!!.toFloat()
        print("Quinto salto: ")
        saltos[4] = readLine()!!.toFloat()
    

        var media = 0f

        for(y in 0 until 5){
            
            media += saltos[y]
        }

        media /= 5f

        println("\n\nResultado final\n")
        println("Atleta: ${nome}")
        println("Saltos: ${saltos[0]}  ${saltos[1]}  ${saltos[2]}  ${saltos[3]}  ${saltos[4]}")
        println("Media dos saltos: ${ media}\n\n")
    }

    return
}