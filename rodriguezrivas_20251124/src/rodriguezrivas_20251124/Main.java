/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguezrivas_20251124;

/**
 *
 * @author sarar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A');//INDICE 0
        grafo.insertarNodo('B');//INDICE 1
        grafo.insertarNodo('C');//INDICE 2
        grafo.insertarNodo('D');//INDICE 3
        
        
        grafo.conectar(0, 1);//A,B
        grafo.conectar(0, 2);//A,C       
        grafo.conectar(1, 3);//B,D  
        grafo.conectar(2, 3);//C,D  

        
        System.out.println("Recorrido Depth First Search (DFS) desde el nodo A");
        
        
        grafo.dfs(0);
        //TEORICAMENTE EL RECORRIDO ES:
        //VISITA NODO A
        //LUEGO VISITA NODO B (PRIMER ADYACENTE DEL A)
        //LUEGO VISITA NODO D (SERIA EL ADYACENTE DEL B)
        //LUEGO RETROCEDE (VUELVE A LA RAÍZ) Y VISITA C (SERIA EL ADYACENTE NO VISITADO DEL A)
        
        
    }
    
    
}
