 

package com.mycompany._objeto;

import java.util.Scanner;

/**
 *
 * @author Alexsandre

*ATRIBUTOS
*Classe CanetaAzul 
* Modelo/Marca : caracter - String - bic
* cor : caracter - String - azul
* Ponta: numero real - Double - 2.0
* Carga : numero interio - int - 50
* Tampa: atributo lógico = boolean (true/false) - false
* 
* METODO
* Escrever
* Rabisco
* Pintar
* Tampar
* Destampar
* 
* METODO Tampar() = ESTADO - tampada , 50%
* 
* 
* 
* OBJETO - UMA CANETA
* CLASSE - FORMA/MOLDE
* 
* metodo rabiscar(); SEMPRE vai ter ()
* se (tampada) entao - sout = erro
* else - sout = rabiscar0
* fimSe
* fimMetodo
* 
* metodo tampar();
* tampada = verdadeira - true
* fim metodo}
* fim classe}
* 
* OBJETO - UMA CANETA
* CLASSE - FORMA/MOLDE
*
* 
* c1 = new caneta;
* DEPOIS DO NEW A CLASSE QUE VOU UTILIZAR
* ANTES DO NEW É O OBJETO QUE VAI EXISTIR
* 
* c1.cor = azul;
* o atributo "cor" do objeto "c1" está recebendo "azul"
* 
* c1.ponta = 0.5;
* c1.tampada = false;
* 
* c1.escrever();
* COM () SEMPRE METODO
* 
* c2 = new caneta;
* c2.cor = preta;
* c2.ponta = 1.0;
* c1.tampada = true;
* 
* 
* 
* c2.destampar();
* 
* 
* 
*/

public class _Objeto {

    public static void main(String[] args) {
       Scanner tecladoString = new Scanner(System.in);
       Scanner tecladoDouble = new Scanner(System.in);
       Scanner tecladoInt = new Scanner(System.in);
       
        System.out.println("Digite a marca da primeira caneta:");
       String marcaC1 = tecladoString.nextLine();
       
        System.out.println("Digite a cor da primeira caneta:");
        String corC1 = tecladoString.nextLine();
        
        System.out.println("Digite a espessura da primeira caneta:");
        double pontaC1 = tecladoDouble.nextDouble();
        
        System.out.println("Digite o quanto ela está cheia entre números de 1 a 100:");
        int cargaC1 = tecladoInt.nextInt();
        
        Caneta c1 = new Caneta();
        c1.marca = marcaC1;
        c1.cor = corC1;
        c1.ponta = pontaC1;
        c1.carga = cargaC1;
        
       
        boolean respostaTampada = c1.perguntarTampada();
        c1.tampada = respostaTampada;
       
        
        
        c1.estado();
        c1.escrever(); 
        
        
        
    }
}
