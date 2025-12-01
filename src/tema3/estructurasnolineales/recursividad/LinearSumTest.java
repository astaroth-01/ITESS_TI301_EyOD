
package tema3.estructurasnolineales.recursividad;

import java.util.Arrays;

public class LinearSumTest {
    public static void main(String[] args) {
        int data[] = {1, 2, 3,10000, 23, 48, 39};
        int n;
        
        System.out.println("Números: " + Arrays.toString(data));
        n = 3;
        System.out.println("\n**********Test 1*********");
        System.out.println("Suma de los primeros " + n + " números: " + 
                LinearSum.sum(data, n));
        
        System.out.println("\n**********Test 2*********");
        n = 5;
        System.out.println("Suma de los primero " + n + "números: " +
                LinearSum.sum(data, n));
        
        System.out.println("\n**********Test 3*********");
        n = 7;
        System.out.println("Suma de los primero " + n + "números: " +
                LinearSum.sum(data, n));
    }
}
