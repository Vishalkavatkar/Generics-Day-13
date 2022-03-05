package floatMaxNumber;

public class FloatMaxNumber {
	
	//creating method to check the maximum float number
	public void maxFloat (Float first, Float second, Float third) {
		
		//considering first is max and assigning max to first
		Float max = first;
		
		//for displaying the position
		String position = "first";
		
		//comparing with first max and if greater that assigning to max
		if(second.compareTo(max) > 0 )
		{
			max = second;
			position = "second";
		}
		
		//comparing with max float and if greater that assigning to max
		if(third.compareTo(max)>0)
		{
			max = third;
			position = "third";
		}
		
		System.out.println("The maximum number is in " + position + " position and the number is : "   + max);
		
	}

}