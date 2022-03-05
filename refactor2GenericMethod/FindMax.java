package refactor2GenericMethod;

//Creating variable of generic
public class FindMax <T extends Comparable<T>>{
	T first;
	T second;
	T third;
	
	// constructor of generic 
	public FindMax(T first, T second, T third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
	 //creating a method 
	public void genericMax() {
	}
	
	//making the method generic type T
	public <T extends Comparable <T>> void genericMax(T first, T second, T third) {
		
		//considering first is max and assigning max to first
		T max = first;
		
		//displaying the position
		String position = "first";
		
		//comparing with first max and if greater that assigning to max
		if(second.compareTo(max)>0)
		{
			max = second;
			position = "second";
		}
		
		//comparing with max value and if greater that assigning to max
		if(third.compareTo(max)>0)
		{
			max = third;
			position = "third";
		}
		System.out.println("The maximum input is in " + position + " position and the input is : "   + max);
	}
	

}

