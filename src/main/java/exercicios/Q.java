/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 *  @author Rodrigo Bergamin - RA: 820280068 - rb.bergamin@gmail.com
 
 Uma rainha requisitou os serviços de um monge e afirmou que pagaria qualquer preço. O monge perguntou se o pagamento poderia ser grãos de trigo dispostos em um tabuleiro de xadrez, de tal forma que o primeiro quadro
 teria apenas um grão e os subsequentes o dobro do quadro anterior. Achando barato, a rainha concordou, mas o pagamento era impossível. Faça um programa que exiba o número de grãos que o monge esperava receber,
sabendo que um tabuleiro de xadrez possui 64 quadros.


 */
public class Q {
    public static void main(String[] args) {
        long accumulator = 1;
        
        for (int i = 1; i <= 8; i++) {
            accumulator *= 2;
        }
        
        System.out.println("A quantidade de grãos a receber é de: " + accumulator);
    }
}
