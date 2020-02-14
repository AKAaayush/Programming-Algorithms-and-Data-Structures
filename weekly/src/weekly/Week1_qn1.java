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
public class Week1_qn1 {
     public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner userinput = new Scanner(System.in);
	System.out.println("Please enter the word: ");
	String sentence= userinput.next();
	//getBytes()method is to convert string into bytes[].
	 byte [] strAsByteArray = sentence.getBytes();
	
	   byte [] result =   new byte [strAsByteArray.length];
	   for (int i = 0; i<strAsByteArray.length; i++) 
           result[i] = strAsByteArray[strAsByteArray.length-i-1]; 
 
       System.out.println(new String(result));
	
}
    
}


