package refactor2GenericMethod;

import java.util.Scanner;

import refactor1Max.FindMax;

public class max {
	 //main method to find maximum
	public static void main(String[] args) {
		
		//creating scanner to take inputs from system
		Scanner sc = new Scanner(System.in);
		
		//creating an object
		FindMax max = new FindMax();
		
		System.out.println("------Find Maximum------");
		
		while(true) {
			System.out.print("Please enter your choice from available :");
			
			// asking user to select the generic type
			System.out.println("\n 1.Integer\n 2.Float\n 3.String\n 4.Exit");
			int option = sc.nextInt();
			
			switch(option) {
			
			case 1:
			{
				System.out.print(" Please enter the first Integer value: ");
				Integer first = sc.nextInt();
				
				System.out.print(" Please enter the second Integer value: ");
				Integer second = sc.nextInt();
				
				System.out.print(" Please enter the third Integer value: ");
				Integer third = sc.nextInt();
				
				//passing the values to the method
				max.genericMax(first, second, third);
				break;
			}
			case 2:
			{
				System.out.print(" Please enter the first float value: ");
				Float first = sc.nextFloat();
				
				System.out.print(" Please enter the second float value: ");
				Float second = sc.nextFloat();
				
				System.out.print(" Please enter the third float value: ");
				Float third = sc.nextFloat();
				
				//passing the values to the method
				max.genericMax(first, second, third);
				break;
			}
			case 3:
			{
				System.out.print(" Please enter the first string : ");
				String first = sc.next();
				
				System.out.print(" Please enter the second string: ");
				String second = sc.next();
				
				System.out.print(" Please enter the third string: ");
				String third = sc.next();
				
				//passing the values to the method
				max.genericMax(first, second, third);
				break;
			}
			case 4:
				System.out.println(" You have exited from the program!!");
				sc.close();
				return;
			default:
				System.out.println("Please enter a valid input from above");
			}
			
			
		}
		
	}

}
