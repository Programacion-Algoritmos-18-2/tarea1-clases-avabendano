/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Victoria
 */
public class Estudiante {

    // Variables globales
    private int edad;
    private int cedula;
    private String nombre;
    int ciclo;

    //Contructror principal
    public Estudiante(String nombre, int edad, int cedula) {
        this.edad = edad;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Metodo para asignar un ciclo
    public void asignar_ciclo(int ciclo) {
        this.ciclo = ciclo;
    }

    // Metodo para obtener un nombre
    public String obtner_nombre() {
        return this.nombre;
    }
}
