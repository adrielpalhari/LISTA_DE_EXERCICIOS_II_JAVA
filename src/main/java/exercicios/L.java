/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 Faça um programa que recebe um número natural e exibe a soma de todos os valores de zero até o número digitado. Exemplo: se receber o valor 5, deve exibir 15 (0 + 1 + 2 + 3 + 4 + 5).
 */
public class L {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        int accumulator = 0;
        
        for (int i = 0; i <= n; i++) {
            accumulator += i;
        }
        
        System.out.println("Resultado: " + accumulator);
    }
}
