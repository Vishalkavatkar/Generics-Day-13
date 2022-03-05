package refactor1Max;

public class FindMax {
	 //making method generic using generic type T
	
	public <T extends Comparable<T>> void genericMax(T first, T second, T third) {
		
		//considering first input is max and assigning max to first
		T max = first;
		
		//displaying the position
		String position = "first";
		
		//comparing with first max and if greater that assigning to max
		if (second.compareTo(max)> 0)
		{
			max = second;
			position = "second";
		}
		
		//comparing with max value and if greater that assigning to max
		if (third.compareTo(max)> 0)
		{
			max = third;
			position = "third";
		}
		System.out.println("The maximum input is in " + position + " position and the input is : "   + max);
	}

}
