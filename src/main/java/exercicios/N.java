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
 [for] Sendo 𝐻 = 1 +1/2 1/3 + 1/4 + 1/5 + 1/6 + ... + 1/n. faça um programa que exibe o valor de 𝐻 após ler 𝑛 (𝑛 > 0).

 */
public class N {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe uma sequência: "));
        double h = 1;
        
        for (int i = 0; i <= n; i++) {
            h += 1.0 / i;
        }
         System.out.println("O resultado da série é: " + h);
    }
}
