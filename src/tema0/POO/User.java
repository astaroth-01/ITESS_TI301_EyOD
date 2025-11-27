/*
 * UNIDAD 0
 * ITESS - TICS 2025 ESTRUCTURA Y ORGANIZACIÓN DE DATOS
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * Descripción: Creando una clase abstracta User
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * Fecha: 18 - 10 - 2025
 */

package tema0.POO;

public abstract class User {
    protected String name;
    
    public User(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
}
