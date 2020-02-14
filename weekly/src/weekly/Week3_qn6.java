/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly;

import java.util.Scanner;

/**
 *
 * @author N I T R O
 */
public class Week3_qn6 {
    static int linearSearch(int ar[], int index, int length, int number) 
     { 
          if (length < index) 
             return -1; 
          if (ar[index] == number) 
             return index; 
          if (ar[length] == number) 
             return length; 
          return linearSearch(ar, index+1, length-1, number); 
     } 
       
   
     public static void main(String[] args)  
     { 
    	 int ar[] = {24,3,6,8,12,59,60};
    	 int number,length;
    	 Scanner userinput=new Scanner(System.in);
    	 System.out.println("Please enter the number you want to search?");
    	
         number=userinput.nextInt();
         userinput.close();
         length=ar.length-1;
          
        int index = linearSearch(ar, 0, length, number); 
        if (index != -1) 
           System.out.println(number + " is at index " +index); 
        else
            System.out.println(number + " is not present in any index"); 
        } 

}

