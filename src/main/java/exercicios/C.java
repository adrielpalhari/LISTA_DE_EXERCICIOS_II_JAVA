
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 * 
    Elabore um programa que exibe qual o número natural que mais se aproxima da raiz
    quadrada de um número natural fornecido pelo usuário sem ultrapassá-lo. Use apenas as
    operações básicas (adição, subtração, multiplicação e divisão). Exemplo: O número
    natural que mais se aproxima de √48, sem ultrapassar, é 6.

 */
public class C {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro")); 
        int raiz = (int) Math.sqrt(n);
        System.out.println(raiz);
    }
}
