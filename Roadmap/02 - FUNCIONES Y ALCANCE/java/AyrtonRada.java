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
    //CON RETORNO SE GUARDA EN VARIABLES, SIN RETORNO SE LLAMAN DIRECTAMENTE
    // SI DEVUELVE SE PONE EL TIPO DE DATO QUE DEVUELVE
    //sin parametros y sin retorno
    
    static String nombre = "Ayrton";
    
    public static void saludar(){
        System.out.println("Hola "+ nombre);
    }
    
    //sin parametros con retorno
    public int obtenerNumero(){
        return 42;
    }
    
    //CON PARAMETRO SIN RETORNO
    public void mostrarSuma(int a, int b){
        System.out.println("La suma es: " + (a + b));
    }
    
    //CON PARAMETROS Y CON RETORNO
    public int sumar(int a, int b){
        return a + b;
    }
    //NO SE PUEDE CREAR UNA FUNCION DENTRO DE OTRA, PERO SI LLAMAR OTRA DENTRO
    
    //DIFICULTAD EXTRA
    public static int extra (String c, String d){
        int contador = 0;
        for(int i = 1; i <=100 ; i++){
            if(i%3==0 && i%5 == 0){
                System.out.println(c + " " + d);
            }else if(i%3==0){
                System.out.println(c);
            }else if(i%5==0){
                System.out.println(d);
            }else{
                contador++;
                System.out.println(i);            
            }         
        }
        
        return contador;
    } 
    
    public static void main(String args[]) {
        // TODO code application logic here
        saludar();
        
        int contador = extra("Texto A", "Texto B");
        System.out.printf("Veces que imprimio el numero: " + contador);
    }
}
