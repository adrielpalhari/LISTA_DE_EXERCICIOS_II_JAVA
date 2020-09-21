
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 *  @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 * 
 *  [while] Elabore um programa que recebe valores naturais até que seja digitado o valor
    zero. O programa deverá exibir a média aritmética. Lembre-se: o valor zero apenas
    sinaliza o fim da entrada, não deve ser contabilizado.

 */
public class B {
    
    public static void main(String[] args) {
        
        int flag = 1;
        int accumulator = 0;
        int i = 0;
        while (flag == 1) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número (Digite 0 para sair): "));
            if(n > 0 ) {
                accumulator += n;
                i++;
            }else {
               flag = 0;
            }
        }
        double media = accumulator / i;
        JOptionPane.showMessageDialog(null, "A média dos números informados é: " + media);
    }
    
}
