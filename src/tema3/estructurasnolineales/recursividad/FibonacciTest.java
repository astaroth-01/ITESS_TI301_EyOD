package tema3.estructurasnolineales.recursividad;

import java.util.Arrays;

public class FibonacciTest {
    
    public static void main(String...args) {
        
        System.out.println("**********FIBONACCI BAD*********");
        int n = 5;
        System.out.println(Fibonacci.fibonacciBad(n));
        
        n = 10;
        System.out.println(Fibonacci.fibonacciBad(n));
        
        n = 12;
        System.out.println(Fibonacci.fibonacciBad(n));
        
        
        System.out.println("\n**********FIBONACCI GOOD*********");
        n = 6;
        System.out.println(Arrays.toString(Fibonacci.fibonacciGood(n)));
        
        n = 23;
        System.out.println(Arrays.toString(Fibonacci.fibonacciGood(n)));
        
        n = 50;
        System.out.println(Arrays.toString(Fibonacci.fibonacciGood(n)));
    }
}
