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
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Informe um número (R$):");
        double numero1 = scn.nextDouble();
        System.out.println("Informe outro número (R$):");
        double numero2 = scn.nextDouble();
        System.out.println("Informe outro número (R$):");
        double numero3 = scn.nextDouble();
        System.out.println("Informe outro número (R$):");
        double numero4 = scn.nextDouble();
        
        double media = (numero1+numero2+numero3+numero4)/4;
        System.out.println("A média é:"+media);    
    }
}
