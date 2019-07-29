/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author fabiana.pagung
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Informe seu saldo:");
        double saldo = scn.nextDouble();
        
        double saldoAtualizado = saldo + 2.5/100*saldo;
        System.out.println("Saldo atualizado:"+saldoAtualizado);  
    }
        
}
