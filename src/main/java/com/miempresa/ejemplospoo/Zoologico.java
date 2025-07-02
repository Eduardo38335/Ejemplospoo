/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.miempresa.ejemplospoo;

/**
 *
 * @author ramos
 */
public class Zoologico {
        private Animal[] animales;
        private int capacidad;
        int cantidadActual;
        
    public Zoologico(int capacidad) {
        this.capacidad = capacidad;
        this.animales = new Animal[capacidad];
        this.cantidadActual = 0;      
    }
    public boolean agregarAnimal(Animal nuevoAnimal){
        if (cantidadActual < capacidad){
            animales[cantidadActual] = nuevoAnimal;
            cantidadActual++;
          System.out.println(nuevoAnimal.getNombre()+"ha  sido agregado al zoologico");
          return true;
    }else{
        System.out.println("El zoologico esta lleno, no se puede agregar a " + nuevoAnimal.getNombre());
            return false;
            
    }
}
public void mostrarAnimales(){
    System.out.println("animales en el zoologio (" + cantidadActual+"/"+ capacidad +")---");
    if (cantidadActual==0){
        System.out.println("EL ZOOLOGICO ESTA VACIO");
            return;                      
    }
    for (int i = 0; i< cantidadActual; i++){
        System.out.println((i+1) + "," + animales [i].toString());
                
    }
    System.out.println("-----------------------");
}
public Animal buscarAnimal(String nombreBuscado){
    for (int i = 0; i < cantidadActual; i++) {
        if (animales[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
            return animales[i];
            
        }
    }
        return null;
        
    }

public boolean cambiarAnimal(int posicion,Animal nuevoAnimal){
    if (posicion>=0 && posicion<cantidadActual) {
        System.out.println("Cambiando" + animales[posicion].getNombre() + "por" + nuevoAnimal.getNombre() + "en la posicion" + posicion + ".");
        animales[posicion] = nuevoAnimal;
        return true;
    }else{
        System.out.println("Posicion invalida para cambiar animal");
        return false;
            
        
    }
        
    }

}
