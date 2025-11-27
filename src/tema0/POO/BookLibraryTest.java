/*
 * UNIDAD 0
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Descripción: Creando una clase BookLibrary
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 01 - 10 - 2025
 */

package tema0.POO;

public class BookLibraryTest {
    public static void main(String[] args) {
        // Probar el constructor
        BookLibraryITESS aBook = new BookLibraryITESS("Cómo programar en Java","Deitel", 4);
        System.out.println(aBook.toString());
        
        // Probar getters
        System.out.println("getTitle(): " + aBook.getTitle());
        System.out.println("getAuthor(): " + aBook.getAuthor());
        System.out.println("getQuantity(): " + aBook.getQuantity());
        
        // Probar isAvailable
        System.out.println("isAvailable(): " + aBook.isAvailable());
        
        // Probar prestar
        System.out.println("Lending...");
        aBook.lend();
        System.out.println("lend(): "  + aBook.getQuantity());
        
        // Probar returnBack
        System.out.println("Returning back...");
        aBook.returnBack();
        System.out.println("lend(): "  + aBook.getQuantity());
        
        // Probar BookInterface
        BookInterface iBook = aBook;
        System.out.println("isAvailable(): " + iBook.isAvailable());
        
        System.out.println("Lending...");
        iBook.lend();
        System.out.println("lend(): "  + aBook.getQuantity());
    }
}
