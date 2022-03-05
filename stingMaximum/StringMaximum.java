package stingMaximum;

public class StringMaximum {
	
	//method to check the maximum String.
	public void maxString(String first, String second, String third) {
		
		//considering first string is max and assigning max to first string
		
		String max = first;
		
		//for displaying the position
		String position = "first";
		
		//comparing with first max and if greater that assigning to max
		if (second.compareTo(max)>0) 
		{
			max = second;
			position = "second";
		}
		
		//comparing with max string and if greater that assigning to max
		if (third.compareTo(max)>0)
		{
			max = third;
			position = "third";
		}
		
		System.out.println("The maximum string is in " + position + " position and the string is : "   + max);
	}

}
