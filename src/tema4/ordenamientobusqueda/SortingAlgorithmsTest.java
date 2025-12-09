/*
 * ITESS - TICS 2025 Estructura y Organización de Datos
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 *
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * 
 * Fecha: 09 - Diciembre - 2025
 */

package tema4.ordenamientobusqueda;

import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmsTest {
    
    public static void main(String...args) {
        int n = 1000000;
        int[]values = generateValues(n);
        
//        System.out.println("*****Prueba de bubble sort con "+ n +" datos***** ");
//        System.out.println("Array sin ordenar");
//        for(int i : values)
//            System.out.println(i);
//        
//        SortingAlgorithms.bubbleSort(values);
//        System.out.println("Array ordenada");
//        for(int i : values)
//            System.out.println(i);
        
        System.out.println("*****Prueba de quick sort con "+ n +" datos***** ");
        System.out.println("Array sin ordenar");
        for(int i : values)
            System.out.println(i);
        
        SortingAlgorithms.quickSort(values, 0, n - 1);
        System.out.println();
        System.out.println("Array ordenada");
        for(int i : values)
            System.out.println(i);
    }
    
    public static int[] generateValues(int n) {
        int[] values = new int[n];
        Random random = new Random();
        
        for(int i = 0; i < n; i++)
            values[i] = random.nextInt(10000);
        
        return values;
    }
}
