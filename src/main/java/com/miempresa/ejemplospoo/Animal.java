/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.miempresa.ejemplospoo;

/**
 *
 * @author ramos
 */
public class Animal {
    private String nombre;
    private String especie;
    
    

    public Animal(String nombre,String especie ) {
        this.nombre = nombre;
        this.especie = especie;             
    }
    public String getNombre(){
        return nombre;
    }
    public String getEspecie(){
        return especie;
}
public void setNombre(String nombre){
    this.nombre = nombre;
    
}
@Override
public String toString(){
    return "Nombre: " + nombre + ", Especie: " + especie;
    }
}