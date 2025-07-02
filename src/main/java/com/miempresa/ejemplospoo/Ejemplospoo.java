/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.miempresa.ejemplospoo;

import java.util.Scanner;

/**
 *
 * @author ramos
 */
public class Ejemplospoo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
            Scanner scanner = new Scanner(System.in);
        
     Zoologico miZoo = new  Zoologico(5);
     
     
     Animal leon = new Animal("simba", "Leon Africano");
     Animal tigre = new Animal("Shere kan", "Tigre de Bengala");
     Animal elefante = new Animal("Dumbo ", "Elefante Asiatico");
     
     miZoo.agregarAnimal(leon);
     miZoo.agregarAnimal(tigre);
     miZoo.agregarAnimal(elefante);
     
     miZoo.mostrarAnimales();
     
     
        System.out.println("---- INTENTANDO AGREGAR ANIMALES-----");
        
     miZoo.agregarAnimal(new Animal("Manny","Mamut Lanudo"));
     miZoo.agregarAnimal(new Animal("Zico","Cbra comun"));
     miZoo.agregarAnimal(new Animal("Pepe","Pez Payaso"));
     
     miZoo.mostrarAnimales();
     
         System.out.println("¿Quieres cambiar un animal existente? Ingresa la posicion (0-" + (miZoo.cantidadActual -1) +")a cambiar: ");
         int posicionCambiar = scanner.nextInt();
         scanner.nextLine();
         
         System.out.print("Ingresa el nombre del nuevo animal: ");
         String nuevoNombre = scanner.nextLine();
         System.out.print("Ingresa la especie del nuevo animal: ");
         String nuevaEspecie = scanner.nextLine();
         
         Animal nuevoAnimal = new  Animal(nuevoNombre, nuevaEspecie);
         
         miZoo.mostrarAnimales();
         
         scanner.close();
         
    
    }
}
