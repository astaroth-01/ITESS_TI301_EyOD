/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Encontrar el número n de la secuencia de fibonacci
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 30 - Noviembre - 2025
 */

package tema3.estructurasnolineales.recursividad;

public class Fibonacci {
    
    public static long fibonacciBad(int n) {
        if(n <= 1)
            return n;
        else
            return fibonacciBad(n - 2) + fibonacciBad(n - 1);
    }
    
    public static long[] fibonacciGood(int n) {
        if(n <= 1) {
            long[] answer = {n, 0};
            return answer;
        } else {
            long[] temp = fibonacciGood(n - 1);
            long[] answer = {temp[0] + temp[1], temp[0]};
            return answer;
        }
    }
}
