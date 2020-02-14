/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly;

import java.util.LinkedList;

/**
 *
 * @author N I T R O
 */
public class Week8_qn12 {
    
    int Graph_Vertex; 
	        LinkedList<Integer> arr[]; 
                
                Week8_qn12(int Graph_Vertex){
                    this.Graph_Vertex = Graph_Vertex;
                    arr = new LinkedList[Graph_Vertex];
                    for(int x = 0; x < Graph_Vertex ; x++){ 
                        arr [x] = new LinkedList<>(); 
                    }
                }
                  static void addEdge(Week8_qn12 DirectedGraph, int sources, int Del) 
	    { 
	      
	        DirectedGraph.arr[sources].add(Del); 
	     
	    } 
                  
                  
    public static void main(String[] args) {
     int Graph_Vertex = 5; 
		        Week8_qn12 Grp = new Week8_qn12(Graph_Vertex); 
		        addEdge(Grp, 0, 3); 
		        addEdge(Grp, 0, 2);
		        addEdge(Grp, 0, 4);
		        addEdge(Grp, 0, 2);
		        addEdge(Grp, 1, 1); 
		        addEdge(Grp, 1, 2); 
		        addEdge(Grp, 1, 3); 
		        addEdge(Grp, 2, 4); 
		        addEdge(Grp, 3, 1); 
		        PDirect_Graph(Grp); 
    }
     
	    
	    static void PDirect_Graph(Week8_qn12 Direct_Graph) 
	    {        
	        for(int Graph_Vertex = 0; Graph_Vertex < Direct_Graph.Graph_Vertex; Graph_Vertex++) 
	        { 
	            System.out.println("Vertex Number"+ Graph_Vertex); 
	            System.out.print("Output"); 
	            for(Integer Values: Direct_Graph.arr[Graph_Vertex]){ 
	                System.out.print(" ->"+Values); 
	            } 
	            System.out.println("\n"); 
	        } 
	    } 
    
}
		     

