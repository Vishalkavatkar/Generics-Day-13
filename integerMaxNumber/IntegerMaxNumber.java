package integerMaxNumber;

public class IntegerMaxNumber {
	
	public void MaxInteger(Integer first, Integer second, Integer third) {
		
		//considering first is max and assigning max to first
		int max = first;        
		
		//for displaying the position
		 String position = "first";    
		 
		//comparing with first max and if greater that assigning to max
		 if (second.compareTo(max)>0) {	
			max = second;                                
			position = "second";
		 }
		
		//comparing with max Integer and if greater that assigning to max
		 if (third.compareTo(max) > 0) {                
			max = third;
			position = "third";
		 }  
		 System.out.println("The maximum number is in " + position + " position and the number is : "   + max);
	}

}
