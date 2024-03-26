
package com.mycompany._objeto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Caneta {
    
    String marca;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    void estado(){
        System.out.println("\nInformações da caneta:");
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Sua marca é: "+ this.marca);
        System.out.println("Ela está "+ this.carga +"% carregada");
        System.out.println("Sua ponta é: "+ this.ponta);
        System.out.println("Ela esta tampada: "+ (this.tampada ? "Sim" : "Não"));
   
    }
    
    
    void escrever(){
     Scanner teclado = new Scanner(System.in);
        
        if(this.tampada == true){
            System.out.println("\nNão posso escrever porque minha caneta está tampada\n");
            
        }else{
            System.out.println("\nEscreva o que quiser: ");
            String escrever = teclado.nextLine();
            
        }
        
    }
    void tampar(){
        this.tampada = true;
        
    }
    void destampar(){
        this.tampada = false;
        
    }
    
    
    boolean perguntarTampada(){
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("A caneta está tampada?");
        String resposta = teclado2.nextLine();
        if(resposta.equalsIgnoreCase("sim")){
     return true; 
     
    }else{ if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")){
        return false;
    }else{
            System.out.println("Resposta inválida");
            return perguntarTampada();
    }}
        
     
    }
    
    
    
    
    
}
