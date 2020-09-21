
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 
 Faça um programa que lê os valores do saldo diário de um cliente durante um mês (trinta dias) e, ao final, exibe o menor e o maior saldo que o cliente teve durante esse período.

 */
public class K {
    public static void main(String[] args) {
         double [] saldos = new double[3];
         
        for (int i = 0; i < saldos.length; i++) {
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo: "));
            saldos[i] = saldo;
            System.out.println(saldos[i]);
        }
        double maiorSaldo = 0;
        double menorSaldo = saldos[0];
        
        for (double saldo : saldos) {
            if(saldo > maiorSaldo){
                maiorSaldo = saldo;
            }
            if(saldo < menorSaldo){
                menorSaldo = saldo;
            }
        }
        System.out.println("O maior saldo do cliente no período de 30 dias foi : " + "R$ " + maiorSaldo);
        System.out.println("O menor saldo do cliente no período de 30 dias foi : " + "R$ " + menorSaldo);
    }
}
