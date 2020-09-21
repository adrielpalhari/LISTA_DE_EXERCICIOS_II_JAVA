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
 Desenvolva um programa que lê cinquenta valores e exibe o maior, o menor e a média dos valores lidos.
 */
public class M {
    public static void main(String[] args) {
 
        int [] valores = new int[50];
        int accumulator = 0;
        
        for (int i = 0; i < valores.length; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
            valores[i] = valor;
            accumulator += valor;
        }
            int maiorValor = 0;
            int menorValor = valores[0];
        
        for (int valor : valores) {
            if(valor > maiorValor){
                maiorValor = valor;
            }
            if(valor < menorValor){
                menorValor = valor;
            }
        }
        
        int media = (int) (accumulator / 50);
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("O menor valor é: " + menorValor);
        System.out.println("A média dos valores é de : " + media);
    }
}
