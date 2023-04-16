/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
a)salário bruto.
b)quanto pagou ao INSS.
c)quanto pagou ao sindicato.
d)o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido. */

fun main(){

    val ganho_hora: Double
    val hora_mes: Double
    val salario_bruto: Double
    val salario_liquido: Double
    val inss_pago: Double
    val sin_pago: Double
    val imposto_renda: Double

    println("Informe quanto você ganha por hora: ")
    ganho_hora = readLine()!!.toDouble()

    println("Informe quantas horas trabalhou no mes: ")
    hora_mes = readLine()!!.toDouble()

    salario_bruto = ganho_hora*hora_mes
    inss_pago = 0.08*salario_bruto
    sin_pago = 0.05*salario_bruto
    imposto_renda = 0.11*salario_bruto
    salario_liquido = salario_bruto - inss_pago - sin_pago - imposto_renda

    println("Salário bruto: R$ $salario_bruto")
    println("Desconto INSS: R$ $inss_pago")
    println("Desconto sindicato: R$ $sin_pago")
    println("Salário liquido: R$ $salario_liquido")

}