/*
 * ITESS - TICS 2025 Estructura y Organización de Datos
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * 
 * Clase con algoritmos de busqueda.
 *
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * 
 * Fecha: 09 - Diciembre - 2025
 */

package tema4.ordenamientobusqueda;

public class SearchAlgorithms {
    
    public static boolean linearSearch(int target, int[] values) throws Exception {
        for(int i = 0; i < values.length; i++) {
            if(target == values[i])
                return true;
        }
        throw new Exception("Target not found");
    }
    
    public static boolean binarySearch(int target, int[] data, int low, int high) {
        if(low > high)
            return false;
        else {
            int mid = (low + high) /2;
            if(target == data[mid])
                return true;
            else if(target < data[mid]) 
                return binarySearch(target, data, low, mid - 1);
            else
                return binarySearch(target, data, mid + 1, high);
        }
    }
    
}
