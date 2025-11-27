/*
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Descripción: Repaso de POO. Creando una biblioteca
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 23 - 09 - 2025
 */

package tema0.POO;

public class BookLibraryITESS implements BookInterface{
    private String title;
    private String author;
    private int quantity;
    
    BookLibraryITESS(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public void lend() {
        
        if(isAvailable())
            this.quantity--;
    }

    @Override
    public void returnBack() {
        this.quantity++;
    }

    @Override
    public boolean isAvailable() {
        return quantity > 1;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public void addQuantity(int quantity) {
        if( quantity <= 0)
            return;
        this.quantity += quantity;
    }

    @Override
    public String getAuthor() {
        
        return this.author;
    }

    @Override
    public String toString() {
        return "BookLibraryITESS{" + "title=" + title + ", author=" + author + ", quantity=" + quantity + '}';
    }
    
}