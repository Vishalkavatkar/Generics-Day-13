package floatMaxNumber;

import java.util.Scanner;

public class max {
	
	public static void main(String[] args) {
		
		//creating scanner to take input from the user
		Scanner sc = new Scanner(System.in);
		
		//Creating an object 
		FloatMaxNumber max = new FloatMaxNumber();
		
		//Taking input from the user
		System.out.println("Enter the first number: ");
		float first = sc.nextFloat();
		System.out.println("Enter the second number: ");
		float second = sc.nextFloat();
		System.out.println("Enter the Third number: ");
		float third = sc.nextFloat();
		
		//passing the values to the method to compute the max Float
		max.maxFloat(first,second,third);
		
	}

}
