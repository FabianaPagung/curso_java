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
public class Exercicio12 {
    public static void main(String[] args) {
                
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Informe um número (R$):");
        double valor1 = scn.nextDouble();
        System.out.println("Informe outro número (R$):");
        double valor2 = scn.nextDouble();
        System.out.println("Informe outro número (R$):");
        double valor3 = scn.nextDouble();
        System.out.println("Informe outro número (R$):");
        double valor4 = scn.nextDouble();
        
        valor1 = (valor1 * 1);
        valor2 = (valor1 * 2);
        valor3 = (valor1 * 3);
        valor4 = (valor1 * 4);
        
        double somaValores = valor1+valor2+valor3+valor4;
        double somaPesos = 1+2+3+4;
     
        System.out.println("A média ponderada é:"+somaValores/somaPesos); 
    }
}

