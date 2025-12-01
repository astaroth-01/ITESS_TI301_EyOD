package tema3.estructurasnolineales.recursividad;

public class PowerTest {
    public static void main(String[] args) {
        
        // Prueba para exponente 50
        long start = System.nanoTime();
       Power.badPower(3, 50);
        long end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 50: " + (end - start) / 1e6 + " ms\n");
        
        // Prueba para exponente 100
        start = System.nanoTime();
        Power.badPower(3, 100);
        end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 100: " + (end - start) / 1e6 + " ms\n");
        
        // Prueba para exponente 1000
        start = System.nanoTime();
        Power.badPower(3, 1000);
        end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 1000: " + (end - start) / 1e6 + " ms\n");
        
        // Prueba para exponente 10000
        start = System.nanoTime();
        Power.badPower(3, 10000);
        end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 10000: " + (end - start) / 1e6 + " ms");
        
        System.out.println("");
        System.out.println("");
        // Prueba para exponente 50
        start = System.nanoTime();
        Power.goodPower(3, 50);
        end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 50: " + (end - start) / 1e6 + " ms\n");
        
        // Prueba para exponente 100
        start = System.nanoTime();
        Power.goodPower(3, 100);
        end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 100: " + (end - start) / 1e6 + " ms\n");
        
        // Prueba para exponente 1000
        start = System.nanoTime();
        Power.goodPower(3, 1000);
        end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 1000: " + (end - start) / 1e6 + " ms\n");
        
        // Prueba para exponente 10000
        start = System.nanoTime();
        Power.goodPower(3, 10000);
        end = System.nanoTime();
        System.out.println("Tiempo de ejecución para exponente 10000: " + (end - start) / 1e6 + " ms");
    }
}
