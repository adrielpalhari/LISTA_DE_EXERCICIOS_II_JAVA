
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 * 
  [for] Desenvolva um programa que exibe a tabuada de um número natural escolhido
    pelo usuário. Os múltiplos apresentados devem ser de 1 a 10.
 */
public class E {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
        
        if(n <= 10 && n >= 1){
            for (int i = 1; i < 11; i++) {
                int result = n * i;
                System.out.println(n + " x " + i + " = " + result);
            }
        }else {
        JOptionPane.showMessageDialog(null, "Informe um número válido entre 1 e 10");
        }
    }
}
