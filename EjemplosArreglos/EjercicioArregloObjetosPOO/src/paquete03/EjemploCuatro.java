/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;
public class EjemploCuatro {
    public static void main(String[] args) {
        /* Aprendimos que podemos crear dentro de esta clase otros objetos como 
        podemos ver en las lineas 15 y 16,         
        */        
        Profesor profesor1 = new Profesor ("Franco", "nombramiento");
        Profesor profesor2 = new Profesor ("Richard", "contrato");
        // crear un arreglo de objetos de tipo Calificacion
        
        Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computación", profesor1);
        Calificacion c2 = new Calificacion(9, "Electrónica", profesor2);
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f - %s - %s\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre(),
            
                    objetoCalificacion.obtenerProfesor().obtenerTipo());
            /*
            Y en la linea 32 y 33 podemos llamar a los atributos que tendria la 
            clase profesor que en este caso son nombre y tipo y llamarlo siguiendo
            la misma estructura como lo vemos.
            */
        }
        
    }
}
