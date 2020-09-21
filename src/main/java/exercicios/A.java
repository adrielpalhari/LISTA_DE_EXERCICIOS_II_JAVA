
package exercicios;

import javax.swing.JOptionPane;


/**
 
  @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
  Elabore um programa que lê um número inteiro n, seguido de n inteiros, e exibe a média dos n números lidos.
 
 */
public class A {
    
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
        int accumulator = 0;
        
        for (int i = 0; i < n; i++) {
            accumulator += i;
        }
        double media = accumulator / n;
        
        System.out.println(media);
    }
}
