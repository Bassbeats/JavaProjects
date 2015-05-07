/**
 * 
 */
package org.cuatrovientos.userinput;

import java.util.Scanner;

/**
 * @author Javier
 *
 */
public class UserInput {
	public static void main (String args[]) {
		int a = 0;
		int b = 0;
		int result = 0;
		Scanner reader = new Scanner(System.in);
		String line = "";
		
			
		//Ask a number
		System.out.println("Enter first number: ");
		line = reader.nextLine();
		a = Integer.parseInt(line);
				
		System.out.println("Enter second number: ");
		line= reader.nextLine();
		b = Integer.parseInt(line);
		
		result = a + b;
		System.out.println("Result is " + result);
		
	}

}
