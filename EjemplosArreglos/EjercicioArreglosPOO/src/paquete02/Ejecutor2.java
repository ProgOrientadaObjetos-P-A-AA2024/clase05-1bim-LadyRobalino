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
        calificaciones.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", calificaciones);
    }
}
