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
 
  [for] Faça um programa que lê cem idades de pacientes e exibe as idades do mais novo e do mais velho.
 */
public class J {
    public static void main(String[] args) {
        int [] idades = new int[10];
        
        for (int i = 0; i < idades.length; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do paciente: "));
            idades[i] = idade;
        }
        int idadeMax = 0;
        int idadeMin = idades[0];
        
        for (int idade : idades) {
            if(idade > idadeMax){
                idadeMax = idade;
            }
            if(idade < idadeMin){
                idadeMin = idade;
            }
        }
        System.out.println("O paciente mais velho tem: " + idadeMax);
        System.out.println("O paciente mais novo tem: " + idadeMin);
    }
}
