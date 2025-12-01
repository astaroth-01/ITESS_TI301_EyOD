/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Sumar los n elementos de una arreglo de manera recursiva.
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 28 - Noviembre - 2025
 */

package tema3.estructurasnolineales.recursividad;

public class LinearSum {
    
    
    public static int sum(int[] nums, int n) {
        if(n == 0)
            return 0;
        else
            return sum(nums, n - 1) + nums[n - 1];
    }
}
