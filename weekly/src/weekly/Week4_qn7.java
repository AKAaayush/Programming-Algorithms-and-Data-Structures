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
public class Week4_qn7 {
 int binary_Search(int ar[], int index, int size, int number) 
    { 
        if (size >= index) { 
            int mid = index + (size - index) / 2; 
  
            if (ar[mid] == number) 
                return mid; 
  
       
            if (ar[mid] > number) 
                return binary_Search(ar, index, mid - 1, number); 
  
          
            return binary_Search(ar, mid + 1, size, number); 
        } 
  
    
        return -1; 
    } 
  
   
    public static void main(String args[]) 
    { 
    	int number,size;
        Week4_qn7 BS = new Week4_qn7(); 
        int ar[] = { 0, 10,20,30,40,50,60,70,80,90}; 
       size = ar.length; 
        number = 10; 
        int result = BS.binary_Search(ar, 0, size - 1, number); 
        if (result == -1) 
            System.out.println("Number not present"); 
        else
            System.out.println("Number found at index " + result); 
    } 
}


