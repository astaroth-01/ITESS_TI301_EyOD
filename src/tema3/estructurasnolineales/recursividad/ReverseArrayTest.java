package tema3.estructurasnolineales.recursividad;

import java.util.Arrays;

public class ReverseArrayTest {
    public static void main(String...args) {
        int []data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int low, high;
        
        System.out.println("Datos: " + Arrays.toString(data));
        
        low = 0;
        high = 5;
        ReverseArray.solve(data, low, high);
        System.out.println("\nTest 1: " + Arrays.toString(data));
        
        int []data2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        low = 4;
        high = 7;
        ReverseArray.solve(data2, low, high);
        System.out.println("\nTest 2: " + Arrays.toString(data2));
        
        int []data3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        low = 0;
        high = 9;
        ReverseArray.solve(data3, low, high);
        System.out.println("\nTest 3: " + Arrays.toString(data3));
    }
}
