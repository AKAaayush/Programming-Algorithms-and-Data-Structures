/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekly;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author N I T R O
 */
public class Week4_qn8 {
public static void main(String[] args) {
		int Number_Choosed,Number_To_Choose,Number_Of_Tries=0;
		boolean win =false;
		Random rand=new Random();
		Number_To_Choose=rand.nextInt(20000);
		Scanner userinput=new Scanner(System.in);
		
		
		while (win==false) {
			System.out.println("Choose a number between 1 to 20000");
			Number_Choosed=userinput.nextInt();
			Number_Of_Tries++;
			if(Number_Choosed>20000 || Number_Choosed<0) {
				System.out.println("You have choosed over limit number");
			}
			else {
			if(Number_Choosed == Number_To_Choose) {
				win=true;
			}
			else if(Number_Choosed<Number_To_Choose) {
				System.out.println("Your number is less than Chossing number  ");
			}
			else if(Number_Choosed>Number_To_Choose) {
				System.out.println("Your number is greater than Chossing number");
			}
			}
		}
		
		System.out.println("Winner");
		System.out.println("The number is" + Number_To_Choose );
		System.out.println("It takes you"+Number_Of_Tries+"tries");
        
	}

}

