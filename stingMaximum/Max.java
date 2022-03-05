package stingMaximum;

import java.util.Scanner;

public class Max {
	
	public static void main(String[] args) {
		
		//Creating scanner to take inputs from the system
		Scanner sc = new Scanner(System.in);
		
		//creating an object
		StringMaximum max = new StringMaximum();
		
		//taking inputs from the user
		System.out.println("Enter the first string: ");
		String first = sc.next();
		System.out.println("Enter the second string: ");
		String second = sc.next();
		System.out.println("Enter the third string: ");
		String third = sc.next();
		
		//passing the values to the method to compute the max String
		max.maxString(first, second, third);
		
		
		
	}

}
