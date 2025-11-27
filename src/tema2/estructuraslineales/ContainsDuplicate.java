/*
 * UNIDAD 0
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Tema 2. Estructuras lineales.
 *  2.1 Listas
 * Problema: Contains duplicate
 * 
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 17 - 10 - 2025
 */

package tema2.estructuraslineales;

import java.util.ArrayList;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = generateNums(10, 100);
        print(nums);
        System.out.println("contains duplicate? " + containsDuplicate(nums));
    }
    
    public static void print(List<Integer> nums) {
        System.out.println(nums.toString());
    }
    
    public static List<Integer> generateNums(int quantity, int range) {
        List<Integer> nums = new ArrayList<>();
        
        for(int i = 0; i < quantity; i++)
            nums.add((int)(Math.random() * range));
        
        return nums;
    }
    
    public static boolean containsDuplicate(List<Integer> nums) {
        for(int i = 0; i < nums.size() - 1; i++)
            for(int j =  i + 1; j < nums.size(); j++)
                if( nums.get(i).equals(nums.get(j))) return true;
        
        return false;
    }
}
