/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
   Fulano tem 160cm de altura e cresce 2 centímetros por ano, enquanto Ciclano tem 110cm de altura e cresce 3 centímetros por ano. Faça um programa que exibe em quantos anos Ciclano superará a altura de Fulano.

 */
public class R {
    public static void main(String[] args) {
        int fulano = 160;
        int ciclano = 110;
        int i = 0;
        
        while(fulano >= ciclano) {
            fulano += 2;
            ciclano += 3;
            i++;
        }
        
        System.out.println("Ciclano superou a altura de Fulano em " + i + " anos");
    }
}
