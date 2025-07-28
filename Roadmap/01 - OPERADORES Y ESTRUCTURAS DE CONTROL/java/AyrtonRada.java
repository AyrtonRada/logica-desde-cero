/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Ayrton
 */
public class AyrtonRada {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
       //OPERADORES ARITMETICOS
       //suma, resta, multipicacion, division entera, modulo (resto = %)
       
       //OPERADORES DE ASIGNACION
       /* '=' es a = 10
           += es a += 5 -> a = a + 5 
           -= es a -= 5 -> a = a - 5
           *= es a *= 5 -> a = a * 5
           /= es a /= 5 -> a = a / 5
           %= es a %= 5 -> a = a % 5
       */
       
       //OPERADORES DE COMPARACION
       /*
        ==, !=, >, <, >=, <=
       */
       
       //OPERADORES LOGICOS
       /*
        && = AND
        || = OR
        ! = NEGACION
       */
       
       //OPERACODRES UNARIOS
       /*
        + positivo
        - negativo
        ++ incremento -> a++
        -- decremento -> a--
        ! negacion logica
       */
       
       //ESTRUCTURA DE CONTROL
       //CONDICIONAL IF
       int a = 2;
       int b = 5;
       
       String resultado = (a > b) ? "A es mayor" : "B es mayor";
       System.out.printf(resultado);
       
       //CONDICIONAL SWITCH
       switch(a){
           case 1: System.out.printf(resultado, args); break;
           case 2: System.out.printf(resultado, args); break;
           default: System.out.printf(resultado, args);
       }
       
       //CICLOS WHILE
       
       int i = 0;
       while (i<5){
           System.out.printf(resultado, args);
           i++;
       }
       
       //CICLOS DO-WHILE
       do{
           System.out.printf(resultado, args);
           i++;
       } while (i<=5);
       
       
       //CICLO FOR
       for (int j = 0; j < 10; j++){
           System.out.printf(resultado, args);
       }
       
       //CONTROL DE CICLOS DE BUCLE
       for(int k = 0; k < 10 ; k++){
           if(k == 5) break;
           System.out.print(k);
       }
       
       //CONTINUE
       for(int q = 1 ; q <= 10 ; q++){
           if(q % 2 != 0) continue;
           System.out.print(q); //Solo imprime pares
       }
    }
}
