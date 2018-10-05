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
public class Ejercicio1 {

    public static void main(String[] args) {
        // Instanciacion de la clase
        Estudiante est1 = new Estudiante("Maria", 18, 1856664828);
        Estudiante est2 = new Estudiante("Pepe", 22, 184555276);

        // Prueba de metodo
        est1.asignar_ciclo(5);
        System.out.printf("El ciclo del estudiante 1 es: %d\n", est1.ciclo);
    }

}
