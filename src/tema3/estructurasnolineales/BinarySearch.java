/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Busqueda de un número en un arreglo ordenado.
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 19 - Noviembre - 2025
 */

package tema3.estructurasnolineales;

public class BinarySearch {
    
    public static void main(String... args) {
        int[] data = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33,37};
        int low = 0;
        int high = data.length - 1;
        
        
        System.out.println(solve(data, 22, low, high));
    }
    
    public static boolean solve(int[] data, int target, int low, int high) {
        if(low > high)
            return false;
        else {
            int mid = (low + high) /2;
            if(target == data[mid])
                return true;
            else if(target < data[mid]) 
                return solve(data, target, low, mid - 1);
            else
                return solve(data, target, mid + 1, high);
        }
    }
}
