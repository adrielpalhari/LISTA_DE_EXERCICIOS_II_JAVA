/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 Um funcionário de uma empresa recebe bonificação salarial anualmente. Sabe-se que ele foi contratado em 2000 com salário de R$ 1.000,00. Em 2001 recebeu bonificação de 0,5% sobre o salário inicial e ano a ano passou
a receber porcentagem em dobro do ano anterior, sempre em relação ao salarial inicial. Faça um programa que mostre ano a ano o salário do funcionário, desde que foi admitido até 2017.

 */
public class Y {
    public static void main(String[] args) {
        double salario = 1000;
        double porcentagem = 0.005;

        
        for (int i = 2001; i <= 2017; i++) {
            double novoSalario = salario + (porcentagem * 1000);
            System.out.println("Salário no ano de " + i + " : R$ " + novoSalario + " - " + "Porcentagem de aumento: " + porcentagem);
            porcentagem = porcentagem * 2;
        }
    }
}
