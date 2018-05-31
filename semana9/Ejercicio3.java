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
public class Ejercicio3 {
    public static void main(String[] args) {
        double [] calificaciones_progr = {18,19,15,16,17,10};
        double [] calificaciones_bd = {10,12,13,20,17,20};
        double [] promedios = new double[6];
        
        for(int contador = 0; contador<calificaciones_bd.length;contador++){
            double suma = calificaciones_progr[contador] + calificaciones_bd[contador];
            double promedio = suma / 2;
            promedios[contador] = promedio;
        }
        
        for (int i=0; i < calificaciones_bd.length; i++){
            System.out.printf("%s %d\t\t%.1f\t%.1f\t%.1f\n", "Estudiante", i + 1, calificaciones_progr[i], calificaciones_bd[i], promedios[i]);
        }
    }
}
