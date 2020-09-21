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
 Faça um programa que recebe a nota de oitenta alunos exibe a maior nota lida.
 */
public class S {
    
    public static void main(String[] args) {
        double [] notas = new double[5];
        
        for (int i = 0; i < notas.length; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota: "));
            notas[i] = nota;
        }
            double maiorNota = 0;
        
        for (double nota : notas) {
            if(nota > maiorNota){
                maiorNota = nota;
            }
        }
        
        System.out.println("A maior nota é: " + maiorNota);
    }
    
}
