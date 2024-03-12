/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;
import java.util.Scanner;

/* @author 20221050100275 */

public class Ex03 {
    public static void main(String[] args) {
       // Iniciando Variáveis
       double base;
       double expoente;
       
       // Iniciando Scanner
       Scanner leia = new Scanner(System.in);
       
       // Entrada de Dados
       System.out.println("Informe a Base:");
       base = leia.nextDouble();
       
       System.out.println("Informe o Expoente:");
       expoente = leia.nextDouble();
       
       // Realizando Cálculo
       double calculo = Math.pow(base, expoente); 
       
       // Saída de Dados
       System.out.println("Base: " + base);
       System.out.println("Expoente: " + expoente);
       System.out.println("Cálculo:" + calculo);
    }
}

/// Math.pow(x, y); Realiza a soma de potenciação.
