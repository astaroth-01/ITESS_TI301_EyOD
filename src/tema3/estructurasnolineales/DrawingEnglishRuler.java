/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 3. Estructuras no lineales.
 *      3.1 Recursividad
 * Problema: Dado una longitud L y Major Tick Length construir una regla.
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 19 - Noviembre - 2025
 */

package tema3.estructurasnolineales;

public class DrawingEnglishRuler {
    
    public static void main(String... args) {
        int inches = 2;
        int majorLength = 4;
        
        drawRuler(inches, majorLength);
    }
    
    public static void drawRuler(int inches, int majorLength) {
        drawLine(majorLength, 0);
        for(int j = 1; j <= inches; j++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, j);
        }
    }
    
    public static void drawInterval(int centralLength) {
        if(centralLength >= 1) {
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }
    
    private static void drawLine(int tickLength, int tickLabel) {
        for(int j = 0; j < tickLength; j++)
            System.out.print("-");
        if(tickLabel >= 0)
            System.out.print(" " + tickLabel);
        System.out.println();
    }
    
    private static void drawLine(int tickLength) {
        for(int j = 0; j < tickLength; j++)
            System.out.print("-");
        System.out.println();
    }
}
