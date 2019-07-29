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
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe um número:");
        int numero1 = scn.nextInt();

        System.out.println("Antecessor de "+numero1 + " é "+ (numero1-1));
        System.out.println("Sucessor de "+numero1 + " é "+ (numero1+1));
              
    }
}
