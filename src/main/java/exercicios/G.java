
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 * 
 * [for] Faça um programa que lê um número natural e exibe o fatorial desse número.
    Lembre-se: 5! é 120, porque 5 × 4 × 3 × 2 × 1 = 120. Use um acumulador e um contador
    dentro de um laço de repetição.
 */
public class G {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
        double fatorial = n;
        
        for (int i = 1; i < n ; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n  + " é: " + fatorial);
    }
}
