/*
 * ITESS - TICS 2025 Estructura y Organización de Datos
 * Periodo: Agosto - Diciembre 2025
 * Docente: Francisco Montecillo Puente 
 * Estudiante / Programador: Angel Flores
 * 
 * E-mail: miguelangelflto6@gmail.com
 * E-mail institucional: ti24110044@itess.edu.mx
 * 
 * Fecha: 26 - Noviembre - 2025
 */
package tema3.estructurasnolineales;

public class GraphTest {

    public static void main(String[] args) {
        Graph tree = new Graph(7);

        tree.addEdge(0, 1);
        tree.addEdge(0, 2);
        tree.addEdge(1, 3);
        tree.addEdge(1, 4);
        tree.addEdge(2, 5);
        tree.addEdge(2, 6);

        System.out.println(tree.depth(5));

        System.out.println("=== TEST ÁRBOL BINARIO CON CIENTOS DE NODOS ===\n");

        int niveles = 3;
        int totalNodos = (int) Math.pow(2, niveles) - 1;
        Graph arbol = crearArbolBinarioCompleto(totalNodos);

//        System.out.println("Depth: " + arbol.depth(1000));
        System.out.println("Altura del arbol método lento: " + arbol.heightBad());

        System.out.println("Altura del arbol método rápido: " + arbol.height(0) + "\n");

        System.out.print("Arbol: ");
        arbol.print();

        System.out.println("");
        System.out.print("recorrido en preorder: ");
        arbol.preorder(0);
        
        System.out.println("");
        System.out.print("recorrido en postorder: ");
        arbol.postorder(0);
        
        System.out.println("");
        System.out.print("BFS: ");
        arbol.breadthfirst();
    }

    public static Graph crearArbolBinarioCompleto(int totalNodos) {
        Graph arbol = new Graph(totalNodos);

        for (int i = 0; i < totalNodos; i++) {
            int hijoIzquierdo = 2 * i + 1;
            int hijoDerecho = 2 * i + 2;

            if (hijoIzquierdo < totalNodos) {
                arbol.addEdge(i, hijoIzquierdo);
            }

            if (hijoDerecho < totalNodos) {
                arbol.addEdge(i, hijoDerecho);
            }
        }

        return arbol;
    }
}
