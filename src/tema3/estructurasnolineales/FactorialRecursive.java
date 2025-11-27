/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Calcular factorial recursivamente
 * 
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 12 - Noviembre - 2025
 */

package tema3.estructurasnolineales;


public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println(5 +"! = " + factorialN(5));
    }
    
    public static int factorialN(int n) {
        if(n == 0) return 1;
        
        return n * factorialN(n-1);
    }
}
