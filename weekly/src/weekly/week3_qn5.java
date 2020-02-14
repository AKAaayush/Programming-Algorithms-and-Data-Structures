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
public class week3_qn5 {
      public static void main (String[] args) {
	Scanner userinput = new Scanner(System.in);
	System.out.println("Enter your Name:  ");
	String Strng = userinput.nextLine();
	
	String reversed = reverse_string(Strng);
	System.out.println("Your name in reverse form: " + reversed);
	
}
public static String reverse_string(String str)
{
    if (str.isEmpty())
        return str;
    //Calling Function Recursively
    return reverse_string(str.substring(1)) + str.charAt(0);
}

}
