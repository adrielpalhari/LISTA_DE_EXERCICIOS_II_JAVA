
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
    [for] Faça um programa que exibe 𝑛 elevado a 𝑚 considerando 𝑛 (real) e 𝑚 (natural)
dados pelo usuário. Não usar funções prontas da linguagem para o cálculo de potência.
 */

public class I {
    public static void main(String[] args) {
        double n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número:"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe seu expoente:"));
        double accumulator = 1;
        
        for (int i = 1; i <= expoente; i++) {
            accumulator *= n;
        }
        
        System.out.println(accumulator);
    }
}
