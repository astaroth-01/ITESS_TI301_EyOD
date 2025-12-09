/*
 * ITESS - TICS 2025 Estructura y Organización de Datos
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * 
 * Clase con algoritmos de ordenamiento.
 *
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * 
 * Fecha: 09 - Diciembre - 2025
 */

package tema4.ordenamientobusqueda;

public class SortingAlgorithms {

    public static void bubbleSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
       
        swap(arr, i + 1, high);  
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    
    
}
