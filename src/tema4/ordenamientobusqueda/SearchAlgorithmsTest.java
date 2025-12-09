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

import java.util.Random;

public class SearchAlgorithmsTest {

    public static void main(String... args) {
        int n = 1000000;
        int[] values = generateValues(n);
        int target = 1000000;

        System.out.println("Busqueda con array no ordenada");
        try {
            if(SearchAlgorithms.linearSearch(target, values))
                System.out.println("Target found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println();
        System.out.println("Busqueda con array ordenada");
        SortingAlgorithms.quickSort(values, 0, n - 1);
        if(SearchAlgorithms.binarySearch(target, values, 0, n - 1))
            System.out.println("Target found");
        else
            System.out.println("Target not found");
    }

    public static int[] generateValues(int n) {
        int[] values = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            values[i] = random.nextInt(10000);
        }

        return values;
    }
}
