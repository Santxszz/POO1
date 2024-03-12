/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02;
import java.util.Scanner;

/* @author 20221050100275 */

public class Ex02 {
    public static void main(String[] args) {
       // Iniciando Variáveis
       double num;
       
       // Iniciando Scanner
       Scanner leia = new Scanner(System.in);
       
       // Entrada de Dados
       System.out.println("Número:");
       num = leia.nextDouble();
       
       // Realizando Cálculo
       double calculo = Math.sqrt(num); 
       
       // Saída de Dados
       System.out.println("Número: " + num);
       System.out.println("Cálculo:" + calculo);
    }
}


