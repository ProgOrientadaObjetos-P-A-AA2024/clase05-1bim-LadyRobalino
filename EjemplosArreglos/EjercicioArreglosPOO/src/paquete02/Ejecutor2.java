/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;
/**
 *
 * @author utpl
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10, 9, 8, 10};
        String nombreEstudiante = "Rene Elizalde";
        LibretaCalificacion calificaciones = new LibretaCalificacion(nombreEstudiante,
                                                           notas);
        calificaciones.establecerPromedio();
        /* Si dejaria comentada las lineas 17 y 22 es decir no llamaria a los 
        metodos lo que imprimiria seriaa 0 y null, porque estos son los valores
        que toma por defecto al no recibir ningun valor.       
        */
        calificaciones.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", calificaciones);
    }
}
