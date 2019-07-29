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
public class Exercicio08 {
    public static void main(String[] args) {
     
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe a despesa:");
        double despesa = scn.nextDouble();
        
        double gorjeta = (despesa*10/100);
        System.out.println("despesa "+ despesa+" + gorjeta "+ gorjeta+" = "+(despesa+gorjeta));
    }
}
