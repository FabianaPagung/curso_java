/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Informe uma temperatura em Cº:");
        double valorInformado = scn.nextDouble();
        
        double convertido = ((9*valorInformado)+160)/5;
        System.out.println("Temperatura em Fahrenheit:"+ convertido);
        
    }
}
