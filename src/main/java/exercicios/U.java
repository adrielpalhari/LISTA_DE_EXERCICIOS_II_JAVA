/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;
import exercicios.Fibonacci;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 A Sequência de Fibonacci é caracterizada por cada termo ser a soma dos dois imediatamente anteriores, sendo que os dois primeiros termos têm valor igual a 1, conforme a seguir: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. Faça um programa que recebe a quantidade de termos desejados e os exibe. Por exemplo, caso a entrada seja 7, o programa deverá exibir os números 1, 1, 2, 3, 5, 8 e 13.

 */
public class U {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para sequência: "));
                
        for (int i = 0; i <= n; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
    }
}
