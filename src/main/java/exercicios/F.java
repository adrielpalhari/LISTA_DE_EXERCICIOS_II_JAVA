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
    Faça um programa que lê as temperaturas máximas de cada um dos 365 dias do ano e
    exibe a temperatura média anual.

 */
public class F {
    public static void main(String[] args) {
        int accumulator = 0;
        
        for (int i = 0; i <= 365; i++) {
            int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura:"));
            accumulator += temperatura;
        }
        int media = (int) (accumulator / 365);
        JOptionPane.showMessageDialog(null, "A média de temperatura anual foi de: " + media);
        
    }
}
