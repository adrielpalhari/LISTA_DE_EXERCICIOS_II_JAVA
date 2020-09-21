
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 Um professor precisa saber qual a média das notas de uma sala e pediu sua ajuda para construir um programa que permita inserir 
 as notas finais de cada aluno e, ao final, exibir a média da sala. Lembre-se que as notas variam de 0 a 10 e o professor digitará -1 quando quiser encerrar as entradas.
 */
public class Z {
    public static void main(String[] args) {
        int flag = 0;
        double accumulator = 0;
        int i = 0;
        
        while (flag == 0) {            
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota: (Digite -1 para sair)"));
            if(nota == -1) {
                JOptionPane.showMessageDialog(null, "Encerrando programa");
                flag = -1;
            }else {
                if(nota <= 10 && nota >= 0){
                    accumulator += nota;
                    i++;
                }else {
                    JOptionPane.showMessageDialog(null, "Informe uma nota válida entre 0 e 10");
                }
            }
        }
        
       double media = accumulator/i;
       System.out.println("A media geral da sala é: " + (media));
    }
}
