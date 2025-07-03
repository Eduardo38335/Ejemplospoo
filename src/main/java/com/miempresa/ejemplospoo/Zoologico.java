package com.miempresa.ejemplospoo;

public class Zoologico 
{
    private Animal[] animales; //Unarreglo de objetos Animal
    private int capacidad;      //Capacidad máxima del zoológico
    int cantidadActual;     //Cantidad de animales actualmente en el zoológico
    
    //Cosntructor: Inicializa el zoológico con una capacidad dada
    public Zoologico(int capacidad) 
    {
        this.capacidad = capacidad;
        this.animales = new Animal[capacidad];  //Creamos el arreglo de Animales
        this.cantidadActual = 0; //Al inicio no hay animales 
    }
    
    //Método para agregar un animal al zoológico
    public boolean agregarAnimal(Animal nuevoAnimal) 
    {
        if (cantidadActual < capacidad)
        {
            animales[cantidadActual] = nuevoAnimal; //Agregamos el animal en la siguiente posición disponible
            cantidadActual++;   //Incremento la cantidad de animales
            System.out.println(nuevoAnimal.getNombre() + " ha sido agregado al zoológico.");
            return true;
        } else {
            System.out.println("El zoológico está lleno, no se puede agregar a " + nuevoAnimal.getNombre());
            return false;
        }
    }
    
    //Método para mostrar todos los animales en el zoologico
    public void mostrarAnimales()
    {
        System.out.println("n--- Aniamles en el zoologico (" + cantidadActual + "/" + capacidad +")--");
        if (cantidadActual == 0) {
            System.out.println("El zoologico está vacío");
            return;
        }
        for(int i = 0; i < cantidadActual; i++) {
            System.out.println((i + 1) + "," + animales[i].toString()); //Usamos el toString del objeto Animal
        }
        System.out.println("============================");
    }
    
    //Método para buscar un animla por su nombre (ejemplo de inetracición con el arreglo)
    public Animal buscarAnimal(String nombreBuscando) 
    {
        for (int i = 0; i < cantidadActual; i++) 
        {
            if (animales[i].getNombre().equalsIgnoreCase(nombreBuscando)) 
            {
                return animales[i]; //Retorna el objeto Animal si lo encuentra
            }
        }
        return null; //Retorna null si no lo encuentra
    }
    
    //Método para cambiar un animal den una posición específica
    public boolean cambiarAnimal(int posicion, Animal nuevoAnimal) 
    {
        if (posicion >= 0 && posicion < cantidadActual) //Validamos la posicion dentro de los animales existentes 
        { 
            System.out.print("Cambiando" + animales[posicion].getNombre() + " por " + nuevoAnimal.getNombre() + " en la posicion" + posicion + ".");
            animales[posicion] = nuevoAnimal; //Reemplazamos el objeto Animal
            return true;
        } else {
            System.out.println("Posicion inválida para cambiar animal.");
            return false;
        }
    }
}