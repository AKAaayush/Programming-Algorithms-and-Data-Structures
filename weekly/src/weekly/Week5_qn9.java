/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly;

/**
 *
 * @author N I T R O
 */
public class Week5_qn9 {
    	Node head; 
	   
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
  
    void Remove_duplicate() 
    { 
        
        Node A = head; 
        while (A != null) { 
             Node temp = A; 
            while(temp!=null && temp.data==A.data) { 
                temp = temp.next; 
            } 
            A.next = temp; 
            A = A.next; 
        } 
    } 
                      
   
    public void push(int new_data) 
    { 
        
        Node Newnode = new Node(new_data); 
   
     
        Newnode.next = head; 
   
      
        head = Newnode; 
    } 
  
   
     void printList() 
     { 
         Node temp = head; 
         while (temp != null) 
         { 
            System.out.print(temp.data+" "); 
            temp = temp.next; 
         }   
         System.out.println(); 
     } 
  
    
    public static void main(String args[]) 
    { 
    	Week5_qn9 llist = new Week5_qn9(); 
        llist.push(50); 
        llist.push(50); 
        llist.push(60); 
        llist.push(70); 
        llist.push(70); 
        llist.push(50);
          
        llist.Remove_duplicate(); 
          
        System.out.println("List after removal of duplicate elements"); 
        llist.printList(); 
    } 
}


