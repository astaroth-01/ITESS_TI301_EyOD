/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Dado un inicio y final de una sub array, invertir los datos.
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 28 - Noviembre - 2025
 */

package tema3.estructurasnolineales.recursividad;

public class ReverseArray {
    
    public static void solve(int[] data, int low, int high) {
        if(low < high) {
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            solve(data, low + 1, high - 1);
        }
    }
}
