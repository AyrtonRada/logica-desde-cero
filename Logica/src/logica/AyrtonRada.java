/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Ayrton
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
 


public class AyrtonRada {   
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        
        //ARRAYS UNIDIMENSIONAL
        int[] numeros = {1,2,3,4};
        System.out.println(numeros[0]); // imprime el 1
        
        //ARRAY DE TAMA�O FIJO
        String[] nombres = new String[3];
        nombres[0] = "Dario";
        nombres[1] = "Miguel";
        nombres[2] = "Juan";
        
        //ARRAY BIDIMENSIONAL
        int[][] matriz = {
            {1,2},
            {3,4}
        };
        System.out.println(matriz[1][0]); // 1 y 0 es la ubicacion que queres imprimir (3)
        
        //ARRAY LIST (requiere importar java.util.ArrayList
        //LAS IMPORTACIONES VAN ANTES DE LAS CLASES
        
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        
        System.out.println(frutas.get(1)); // Imprime Banana
        
        //LINKEDLIST (LISTA ENLAZADA)
        // importar java.util.LinkedList
        LinkedList<Integer> numero = new LinkedList<>();
        numero.add(5);
        numero.add(10);               
        numero.addFirst(1); //Inserta al inicio
        
        //HASHSET - SIRVE PARA EVITAR DATOS DUPLICADOS
        // importar java.util.HashSet
        
        HashSet<String> colores = new HashSet<>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Rojo"); //No se agrega porque ya es existe
        
        System.out.println(colores); // imprime rojo, azul
        
        //TREESET - ORDENA TODOS LOS ELEMENTOS EN SU INTERIOR
        // import java.util.TreeSet
        
        TreeSet<Integer> ban = new TreeSet<>();
        ban.add(50);
        ban.add(10);
        ban.add(20);
        
        System.out.println(ban); // imprime (10,20,50)
        
        //HASHMAP - CLAVE-VALOR SI TIENE MISMA CLAVE NO LA REPITE PERO ACTUALIZA EL VALOR
        // import java.util.HashMap
        
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 20);
        edades.put("Juan", 30);
        edades.put("Ana", 50);
        
        System.out.println(edades.get("Ana")); //50
        
        //TREEMAP - ORDENA POR CLAVES
        // import java.util.TreeMap
        
        TreeMap<String, String> paises = new TreeMap<>();
        paises.put("BO", "Bolivia");
        paises.put("AR", "ARGENTINA");
        
        System.out.println(paises); // AR = ARGENTINA, BO = BOLIVIA
        
        // STACK - PILA, MUESTRA LO ULTIMO QUE SE AGREGO COMO PRIEMRO (COMO PLATOS ORDENADOS)
        //import java.util.Stack
        
        Stack<String> pila = new Stack<>();
        pila.push("Uno");
        pila.push("Dos");
        pila.push("Tres");
        
        System.out.println(pila.peek()); // imprimira "Tres"
        System.out.println(pila.pop()); // imprime todo menos el "Tres" porque fue eliminado
        
        //QUEUE - ASI COMO STACK TRABAJA CON EL ULTIMO DATO INGRESADO
        //QUEUE TRABAJA CON EL PRIMER DATO INGRESADO
        //import java.util.Queue
        
        Queue<String> cola = new LinkedList<>();
        cola.add("Juan");
        cola.add("Ana");
        cola.add("Luis");
        
        System.out.println(cola.peek()); //Muestra "Juan"
        System.out.println(cola.poll()); // imprime y remueve "Juan"
        
        //EXTRA - AGENDA
        
        ArrayList<String> agenda = new ArrayList<>();
        Scanner tecla = new Scanner(System.in);
        int bandera = 0;
        
            
        // (TRUE) SERA UN BUCLE INFINITO HASTA QUE EL USUARIO QUIERA SALIR
        while(true){              
          //MENU
                  
         System.out.println("MENU DE OPCIONES");
         System.out.println("1) BUSCAR CONTACTO: ");
         System.out.println("2) INSERTAR CONTACTO: ");
         System.out.println("3) ACTUALIZACION DE CONTACTOS: ");
         System.out.println("4) ELIMINACION DE CONTACTOS: ");
         System.out.println("5) SALIR: ");
         System.out.println("6) VER LISTA DE CONTACTOS");
          System.out.println("ELIJA UNA OPCION: ");  
          int opcion = tecla.nextInt();
          tecla.nextLine();
          
          switch(opcion){
              
              //BUSQUEDA 
              case 1: 
                  System.out.println("Ingrese el nombre");
                  String nombre = tecla.nextLine();
                  for(String contacto : agenda){
                      if(contacto.contains(nombre)){
                          System.out.println(contacto);
                      }else{
                          System.out.println("No se encontro contacto");
                      }
                  }
                  break;
                  
              // INSERTAR
              case 2:
                  System.out.print("Ingrese el nombre: ");
                  String name = tecla.nextLine();
                  System.out.print("Ingrese numero de telefono: ");
                  String numTel = tecla.nextLine();
                  
                  if(numTel.matches("\\d{10}")){
                      System.out.println("Contacto actualizado correctamente");
                      agenda.add(name + " - " + numTel);
                  }else{
                      System.out.println("Numero imvalido.");
                  }
                  break;
              
              //ACTUALIZACION
              case 3:
                  System.out.println("Ingrese el nombre a actualizar: ");
                  String contactoViejo = tecla.nextLine();
                  boolean encontrado = false;
                  for(int i = 0; i < agenda.size(); i++){
                      if(agenda.get(i).contains(contactoViejo)){
                          System.out.println(agenda.get(i));                          
                          System.out.println("Ingrese Nuevo Nombre: ");
                          String nameNew = tecla.nextLine();
                          System.out.println("Ingrese nuevo numero de telefono: ");
                          String numTelNew = tecla.nextLine();
                          if(numTelNew.matches("\\d{10}")){
                             agenda.remove(i);
                             System.out.println("Contacto actualizado correctamente");
                             agenda.add(nameNew + " - " + numTelNew);
                          }else{
                             System.out.println("Numero imvalido.");
                          }
                          encontrado = true;
                          break;
                      }
                  }
                  if(!encontrado){
                      System.out.println("No se encontro el contacto");
                  }
                  break;
              //ELIMINACION
              case 4:
                  System.out.println("Ingrese el nombre a Eliminar: ");
                  String nombreDelete = tecla.nextLine();
                  for(String contacto : agenda){
                      if(contacto.contains(nombreDelete)){
                          agenda.remove(contacto);
                      }else{
                          System.out.println("No se encontro el contacto.");
                      }
                  }
                  break;
                  
              //SALIR
              case 5:
                  System.out.println("Saliendo del programa...");
                  System.exit(0);
                  break;
              
              //MOSTRAR TODA LA AGENDA
               case 6:   
                   if(agenda.isEmpty()){
                       System.out.println("La agenda esta vacia.");
                   }else{
                       for(String contacto : agenda){
                        System.out.println("- " + contacto);
                        }
                   }
                   
                  break;
              
             //DEFAULT
              default: 
                  System.out.println("Opcion no valida.");
                  break;
          }
        }
    }
}
