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
        
        // ----1. Crear una instancia del Zoológico ----
        // Nuestro zoológico tendrá una capacidad máxima de 5 animales.
        Zoologico miZoo = new Zoologico(5);
       
        // ----2. Crear objertos Animal y agregarlos al Zoológico ----
        Animal leon = new Animal ("Simba", "León Africano");
        Animal tigre = new Animal ("Shere khan" , "Tigre de Bengala");
        Animal elefante = new Animal ("Dumbo" , "Elefante Asiático");
       
        miZoo.agregarAnimal(leon);
        miZoo.agregarAnimal(tigre);
        miZoo.agregarAnimal(elefante);
       
        // ----3. Mostrar los animales del zoológico -----
        miZoo.mostrarAnimales();
       
       // ----- 4. Intentar agregar más animales hasta llenar el zoológico ----
        System.out.println("\n--- Intentando agregar más animales ----");
        miZoo.agregarAnimal(new Animal("Manny" , "Mamut Lanudo"));
        miZoo.agregarAnimal(new Animal("Zico" , "Cebra Comun"));
        miZoo.agregarAnimal(new Animal("Pepe" , "Pez Payaso")); // Este no deberia agregar si la cantidad es 5
        
        miZoo.mostrarAnimales();
        
        //-----5. Buscar animal por nombre
        System.out.println("\nIngresa el nombre de un animal para buscar: ");
        String nombreABuscar = scanner.nextLine();
        Animal animalEncontrado = miZoo.buscarAnimal(nombreABuscar);
        
        if(animalEncontrado != null){
            System.out.println("Animal encontrado: " + animalEncontrado.toString());
        }else{
            System.out.println("El animal " + nombreABuscar + "No se encuentra en el zoologico");
        }
        
        //----6. Cambiar un animal en una posición específica ------
        System.out.println("\n¿Quieres cambiar un animal existente? Ingresa la posición (0--" + (miZoo.cantidadActual - 1) + ") a cambiar: ");
        int posiciónCambiar = scanner.nextInt();
        scanner.nextLine(); //Consumir el salto de la linea
        
        System.out.println("Ingresa el nombre del nuevo animal: ");
        String nuevoNombre = scanner.nextLine();
        System.out.println("Ingresa la especie del nuevo animal: ");
        String nuevaEspecie = scanner.nextLine();
        
        Animal nuevoAnimal = new Animal(nuevoNombre, nuevaEspecie);
        miZoo.cambiarAnimal(posiciónCambiar, nuevoAnimal);
        
        miZoo.mostrarAnimales(); //Mostrar el zoológico actualizado
        
        scanner.close(); //Cerrar el scanner
    }
}