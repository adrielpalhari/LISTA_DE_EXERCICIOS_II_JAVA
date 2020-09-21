/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 *  @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 Faça um programa que lê o saldo de uma conta corrente e as movimentações feitas nela (valores positivos e negativos). Quando uma movimentação com valor zero for inserida, o programa deverá exibir o saldo final.
 * 
 */
public class P {
    public static void main(String[] args) {
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo da conta "));
        int flag = 1;
        
        
         while (flag == 1) {            
            double movimentacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da movimentação "));
            if(movimentacao == 0) {
                flag = 0;
            }else {
                saldo += movimentacao;
            }
        }
        
        System.out.println("O saldo final da conta é de: " + saldo);
         
    }
}
