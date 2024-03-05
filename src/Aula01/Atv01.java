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
public class Atv01 {
    public static void main(String[] args) {
        // Iniciando Variáveis
        int Numero;
        int Calculo;
        
        // Iniciando Scanner
        Scanner leia = new Scanner(System.in);
        
        // Entrada de Dados
        System.out.println("Número:");
        Numero = leia.nextInt();
        
        // Laço para repetir os números5
        for (int i = 1; i <= 10; i++) {
            Calculo = (Numero * i); // Cálculo dos números
            System.out.println(Numero + " x " + i + " = " + Calculo); // Print do reultado
        }
    }
    
}
