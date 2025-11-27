/*
 * UNIDAD 0
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Descripción: Repaso de POO
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 23 - 09 - 2025
 */

package tema0.POO;

public interface BookInterface {
/* 
* Métodos publicos
* No es ejecutable
* En versiones más recientes puede contener atributos estáticos
* Ejemplo para una billioteca
*/ 
    
    void lend();
    void returnBack();
    boolean isAvailable();
    String getTitle();
    int getQuantity();
    void addQuantity(int quantity);
    String getAuthor();
}
