/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author N I T R O
 */
public class Week7_qn11 {

    private int Vert;   // No. of vertices 
    private LinkedList<Integer> arr[];
    
    public Week7_qn11(int vert) 
    { 
        Vert = vert; 
        arr = new LinkedList[vert]; 
        for (int x=0; x<vert; ++x) 
            arr[x] = new LinkedList(); 
    } 
    void Week7_qn11(int y) 
    { 
        boolean v[] = new boolean[Vert]; 
  
        LinkedList<Integer> q = new LinkedList<Integer>(); 
  
     
        v[y]=true; 
        q.add(y); 
  
        while (q.size() != 0) 
        { 
            
            y = q.poll(); 
            System.out.print(y+" "); 
  
          
            Iterator<Integer> i = arr[y].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!v[n]) 
                { 
                    v[n] = true; 
                    q.add(n); 
                } 
            } 
        } 
    } 
    public static void main(String[] args) {
      Week7_qn11 E = new Week7_qn11(4);
 
        E.addEdge(2, 1);
        E.addEdge(2, 0);
        E.addEdge(1, 3);
        E.addEdge(3, 0);
        E.addEdge(2, 0);
        E.addEdge(3, 1);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        E.Week7_qn11(2);
    }
	    
	    void addEdge(int noOfver,int widthOfUndirectedGraph) 
	    { 
	        arr[noOfver].add(widthOfUndirectedGraph); 
	    } 
}
