/*
 * ITESS - TICS 2025 MATEMATICAS PARA LA TOMA DE DECISIONES
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

import java.util.List;
import java.util.ArrayList;

public class Graph {

    private List<List<Integer>> graph; // lista de adyacencia
    private int n; // Numero de vertices
    private boolean[] verticesVisited;

    public Graph(int n) {
        this.n = n;
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        verticesVisited = new boolean[graph.size()];
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void print() {
        int nodo = 0;

        for (var al : graph) {
            System.out.print(nodo + ": ");
            for (var i : al) {
                System.out.print(i + ", ");
            }
            System.out.println("");
            nodo++;
        }
    }

    public List<List<Integer>> getVertices() {
        return this.graph;
    }

    public int depth(int p) {
        if (p == 0) {
            return 0;
        }

        return 1 + depth(graph.get(p).get(0));
    }

    public int heightBad() {
        int h = 0;
        for (int p = 0; p < n; p++) {
            if (isExternal(p)) {
                h = Math.max(h, depth(p));
            }
        }
        return h;
    }

    public int height(int p) {
        int h = 0;
        if (p == 0) {
            for (int i = 0; i < graph.get(p).size(); i++) {
                h = Math.max(h, 1 + height(graph.get(p).get(i)));
            }
        }

        for (int i = 1; i < graph.get(p).size(); i++) {
            h = Math.max(h, 1 + height(graph.get(p).get(i)));
        }

        return h;
    }

    private boolean isExternal(int p) {
        if (p == 0) {
            return graph.get(p).isEmpty();
        } else {
            return !(graph.get(p).size() > 1);
        }
    }

    public void preorder(int p) {
        System.out.print(p + ", ");
        verticesVisited[p] = true;
        for (int i = 0; i < graph.get(p).size(); i++) {
            if (!verticesVisited[graph.get(p).get(i)]) {
                preorder(graph.get(p).get(i));
            }
        }
        if(p == 0)
            verticesVisited = new boolean[graph.size()];
    }

    public void postorder(int p) {

        if(p == 0)
            for (int i = 0; i < graph.get(p).size(); i++) {
            if (!verticesVisited[graph.get(p).get(i)]) {
                postorder(graph.get(p).get(i));
            }
        }
        
        for (int i = 1; i < graph.get(p).size(); i++) {
            if (!verticesVisited[graph.get(p).get(i)]) {
                postorder(graph.get(p).get(i));
            }
        }

        System.out.print(p + ", ");
        verticesVisited[p] = true;
        if(p == 0)
            verticesVisited = new boolean[graph.size()];
    }

}
