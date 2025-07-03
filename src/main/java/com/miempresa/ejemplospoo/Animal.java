/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.miempresa.ejemplospoo;

/**
 *
 * @author ramos
 */
public class Animal {
    //Atributos de la clase Animal
    private String nombre;
    private String especie;
        
    //Constructor: Se usa para crear nuevas instancias de Animal
    public Animal(String nombre, String especie) {
    this.nombre = nombre;
    this.especie = especie;
    }
       
    //Métodos "get" se usa para acceder a los atributos (encapsulación)
    public String getNombre()
    {
        return nombre;
    }
        
    public String getEspecie()
    {
        return especie;
    }
        
        //Métodos "set" para modificar los atributos (si se permite)
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setEspecie(String especie)
    {
        this.especie = especie; 
    }
    
    //Método para mostrar la información del animal
    @Override //Sobrescribe el método toString de la clase Object
    public String toString()
    {
        return "Nombre: " + nombre + "Especie: " + especie;
    }
}