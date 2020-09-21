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
 [while] Uma empresa está fazendo uma pesquisa, ligando para telespectadores e perguntando qual canal de televisão (4, 5 ou 9) eles estão assistindo. A cada ligação a resposta é registrada em um software e, no final do
    dia, alguém digita zero e os canais com seus respectivos votos são exibidos em ordem decrescente. Construa esse software. Obs.: Considere que não haverá empate.

 */
public class W {
    public static void main(String[] args) {
        int flag = 1;
        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
       
        
        while (flag == 1) {            
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Qual canal você está assistindo? (Digite 0 para sair)"));
            if(voto == 0) {
                JOptionPane.showMessageDialog(null, "Encerrando programa");
                System.out.println("----------- ESPECTADORES --------------");
               if(canal4 > canal5 && canal4 > canal9){
                   if(canal5 > canal9){
                        System.out.println("Canal 4: " + canal4 + "\n" + "Canal 5: " + canal5 + "\n" + "Canal 9: " + canal9);
                   }
                   else {
                       System.out.println("Canal 4: " + canal4 + "\n" + "Canal 9: " + canal9 + "\n" + "Canal 5: " + canal5);
                   }
               }else if(canal5 > canal4 && canal5 > canal9) {
                   if(canal4 > canal9){
                        System.out.println("Canal 5: " + canal5 + "\n" + "Canal 4: " + canal4 + "\n" + "Canal 9: " + canal9);
                   }
                   else {
                       System.out.println("Canal 5: " + canal5 + "\n" + "Canal 9: " + canal9 + "\n" + "Canal 4: " + canal4);
                   }
               
               }else if(canal9 > canal4 && canal9 > canal5){
                   if(canal4 > canal5){
                        System.out.println("Canal 9: " + canal9 + "\n" + "Canal 4: " + canal4 + "\n" + "Canal 5: " + canal5);
                   }
                   else {
                       System.out.println("Canal 9: " + canal9 + "\n" + "Canal 5: " + canal5 + "\n" + "Canal 4: " + canal4);
                   }
               }else {
                   System.out.println("Votos não computados");
               }
               
               flag = 0;
               
            }else {
               if(voto == 4) {
                canal4 ++;
                }
                if(voto == 5){
                canal5 ++;
                }
                if(voto == 9) {
                canal9 ++;
            }
            }
        }
    }
}
