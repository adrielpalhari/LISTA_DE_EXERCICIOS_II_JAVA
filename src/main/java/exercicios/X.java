/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 
  [while] Certa pessoa (A) possui R$ 10.000,00 e tem sua fortuna crescendo em R$ 100,00 por mês. Outra pessoa (B) tem sua fortuna crescendo em R$ 300,00 ao mês e possui R$ 5.000,00. Faça um programa que exibe, mês a mês, 
  * a diferença das duas fortunas até que a pessoa (B) tenha mais dinheiro do que a pessoa (A).
 */
public class X {
    public static void main(String[] args) {
        double a = 10000.00;
        double b = 5000.00;
      
        int i = 0;
        
        while(a >= b) {
            a += 100;
            b += 300;
            System.out.println("Fortuna de A: " + a);
            System.out.println("Fortuna de B: " + b);
            i++;
        }
        
        System.out.println("A superou a fortuna de B em " + i + " meses");
    }
}
