/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Imprimir n veces un nombre
 * 
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 12 - Noviembre - 2025
 */

package tema3.estructurasnolineales;

public class MyNameRecursive {
    public static int count = 0;
    
    public static void main(String...args) {
        printName(5, "miguel flores");
    }
    
    public static void printName(int n, String name) {
        if(count > n) {
            count = 0;
            return;
        }
        
        System.out.println("Count: " + count);
        System.out.println("Name: " + name + "\n");
        count++;
        printName(n, name);
    }
}
