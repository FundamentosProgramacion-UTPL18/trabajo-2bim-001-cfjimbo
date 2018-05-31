/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana9;

/**
 *
 * @author cfjimbo
 */
public class Ejercicio2 {
    /* Arreglos
    Ejercicio2
    */
    
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7}; // arreglos
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]%2==0);
                System.out.printf("Tabla%d\n", arreglo[i]);
                for (int j = 1; j <= 12; j++){
                    int mult;
                    mult = arreglo [i] * j;
                    System.out.printf("%d*%d=%d\n", arreglo [i], j, mult);
                } // Fin For
            } // Fin For
        } // Fin Main
    } // Fin Class Ejercicio2
