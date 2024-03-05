/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;

import java.util.Scanner;

/**
 *
 * @author 20221050100275
 */
public class Ex02 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double altura;
        Boolean matricula;
        
        
        // Iniciando Scanner
        Scanner leia = new Scanner(System.in);
        
        // Lendo dados do usuário
        System.out.println("Nome: ");
        nome = leia.next();
        
        System.out.println("Idade:");
        idade = leia.nextInt();
        
        System.out.println("Altura:");
        altura = leia.nextDouble();
        
        System.out.println("Matricula:");
        matricula = leia.nextBoolean();
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(matricula);
    }
    
}
