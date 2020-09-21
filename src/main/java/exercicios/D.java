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
 * 
 * Crie um programa que exibe uma lista de graus Fahrenheit (𝐹) e os correspondentes
    em graus centígrados (𝐶) variando de 50 a 150, com passos de uma unidade. A fórmula de conversão é 𝐶 = 5 ÷ 9 ×
(𝐹 − 32).
 */
public class D {
 
   
    public static void main(String[] args) {
        
        int [] grausF = new int[10];
        int [] grausC = new int[10];
        
        
        for (int i = 0; i < grausF.length; i++) {
            int temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe uma temperatura entre 50ºF e 150ºF: "));
            
            if(temperatura <= 150 && temperatura >= 50) {
                 grausF[i] = temperatura;
                int toCelsius = (int) (( temperatura - 32 ) / 1.8);
                grausC[i] = toCelsius;
            }else {
                JOptionPane.showMessageDialog(null, "Atenção! Informe uma temperatura válida entre 50ºF e 150ºF");
            }
           
        }
        
       System.out.println("------------------ TEMPERATURA EM FAHRENHEIT ----------------------");
        for (int temp : grausF) {
            System.out.println(temp);
        }
        
        
        System.out.println("------------------ TEMPERATURA CORRESPODENTE EM CELSIUS ----------------------");
        for (int temp : grausC) {
            System.out.println(temp);
        }
        
    }
    
}
