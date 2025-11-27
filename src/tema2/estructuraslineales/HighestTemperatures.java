/*
 * Tema 2
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 2. Estructuras lineales.
 *   Stacks
 * Problema: Encontrar el número de días que tinen que pasar para encontrar una 
 *           temperatura más alta a la temperatura actual
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 22 - 10 - 2025
 */

package tema2.estructuraslineales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class HighestTemperatures {
    public static void solve(List<Integer> temperatures) {
        // crear arreglo días 
        List<Integer> days = new ArrayList<>();
        
        // Crear stack que inidique el idx de temperaturas altar
        Stack<Integer> highestTemp = new Stack<>();
        
        // Inicializar dias igual a cero
        for(int i = 0; i < temperatures.size(); i++)
            days.add(0);
        
        highestTemp.push(temperatures.size() - 1);
        
        for(int i = temperatures.size() - 2; i >= 0; i--) {
            
            while (!highestTemp.isEmpty() && temperatures.get(highestTemp.peek()) < temperatures.get(i)) {
                highestTemp.pop();
            }
            if (highestTemp.isEmpty()) {
                highestTemp.push(i);
                continue;
            }
            days.set(i, highestTemp.peek() - i);
            highestTemp.push(i);
        }
        
         System.out.println(Arrays.toString(days.toArray()));
    }
}
