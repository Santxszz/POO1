/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula01;


/**
 *
 * @author 20221050100275
 */
public class Ex01 {
    public static void main(String[] args) {
        // Iniciando variáveis
        String nome;
        String nome2;
        String sitMatricula;
        int idade;
        double altura;
        boolean matriculado;
        
        // Definindo conteúdo das variáveis
        nome = "Erek Couto Santos";
        idade = 20;
        altura = 1.89;
        matriculado = true;
        
        // Condição
        if(matriculado == true) {
            sitMatricula = "Matriculado";
        } else {
            sitMatricula = "Não Matriculado";
        }
       
 
        // Saída de dados (PRINT)
        System.out.println("---------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: " + altura);
        System.out.println("Matriculado: " + sitMatricula);
        System.out.println("---------------------------------------");
        
       
    }
}

// var nome = args.join("");