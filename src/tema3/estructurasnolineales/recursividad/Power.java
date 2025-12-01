/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Cálculo de potencia de manera recursiva lineal.
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 28 - Noviembre - 2025
 */

package tema3.estructurasnolineales.recursividad;

public class Power {
    public static double badPower(double x, int n) {
        if(n == 0)
            return 1;
        else 
            return x * badPower(x, n-1);
    }
    
    public static double goodPower(double x, int n) {
        if(n == 0)
            return 1;
        else {
            double partial = goodPower(x, n / 2);
            double result = partial * partial;
            if(n % 2 == 1)
                result *= x;
            return result;
        }
    }
}
