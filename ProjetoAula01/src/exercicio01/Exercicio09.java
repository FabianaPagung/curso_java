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
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Informe o valor do salário mínimo:");
        double salarioMinino = scn.nextDouble();
        System.out.println("Informe o salário da pessoa:");
        double salarioPessoa = scn.nextDouble();
        
        int quantidadeSalariosPessoa = (int) (salarioPessoa/salarioMinino);
        
        System.out.println("Valor Salário Mínimo: R$" + salarioMinino);
        System.out.println("Valor Salário Pessoa: R$" + salarioPessoa);
        System.out.println("Pessoa recebe " + quantidadeSalariosPessoa +" salários mínimos");     
    }
}
