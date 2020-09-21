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
  [while] Faça um programa que recebe valores inteiros positivos até que seja digitado o valor zero. O programa deverá exibir o maior valor digitado.
 */
public class O {
    public static void main(String[] args) {
        int [] valores = new int[51];
        int flag = 1;
        int i = 0;
        while (flag == 1) {

            int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número (Digite 0 para sair): "));
            if(n > 0) {
                valores[i] = n;
                i++;
            }else{
                flag = 0;
            }
            
        }
        
        int maiorValor = 0;
        for (int valor : valores) {
            if(valor > maiorValor){
                maiorValor = valor;
            }
        }
        
        System.out.println("O maior valor é: " + maiorValor);
    }
}
