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
public class Week6_qn10 {
static class node {
            int value;
            node l , r ;
            
            }
    static node newNode(int datainsert)  
	{  
	    node t = new node();  
	    
	    t.value = datainsert;  
	    
	    t.l = null;  
	    t.r = null;  
	    
	    return t;  
	}  
    static node insert(node root, int key) {  
	  
	    node newnode = newNode(key);  
	    node i = root; 
	    node j = null;  
	    while (i != null) {  
	        j = i;  
	        if (key < i.value)  
	            i = i.l;  
	        else
	            i = i.r;  
            }
            if (j == null)  
	        j = newnode; 
            else if (key < j.value)  
	        j.l = newnode;
            else
	        j.r = newnode; 
            return j;  
        }
    static void Inorder(node root)  
	{  
	    if (root == null)  
	        return;  
	    else {  
	        Inorder(root.l);  
	        System.out.print( root.value +" ");  
	        Inorder(root.r);  
	    }  
	}  
public static void main(String[] args){
     node root = null;  
	    root = insert(root, 50);  
	    insert(root, 336);  
	    insert(root, 200);  
	    insert(root, 456);  
	    insert(root, 756);  
	    insert(root, 633);  
	    insert(root, 834);  
            Inorder(root);  
}
}
