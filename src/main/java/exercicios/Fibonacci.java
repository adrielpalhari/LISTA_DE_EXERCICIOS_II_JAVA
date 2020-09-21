/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 Classe para auxiliar o exercício referente a sequência Fibonacci
 * @author Rodrigo
 */
public class Fibonacci {
    
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
    
}
