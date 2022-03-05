package integerMaxNumber;

import java.util.Scanner;

public class Max {
	/**
	 * creating object
	 * taking input from user
	 * passing the values to the method to compute the maximum Integer
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//creating object
		IntegerMaxNumber max = new IntegerMaxNumber(); 
		
		//taking input from user
		System.out.println("Please enter the first number: ");          
		Integer first = sc.nextInt();
		System.out.println("Please enter the second number: ");
		Integer second = sc.nextInt();
		System.out.println("Please enter the third number: ");
		Integer third = sc.nextInt();
		
		//passing the values to the method to compute the maximum Integer
		max.MaxInteger(first, second, third);                              

	}
}
