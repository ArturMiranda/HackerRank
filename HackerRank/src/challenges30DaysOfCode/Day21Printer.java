package challenges30DaysOfCode;

public class Day21Printer <T>{
	
	void printArray(T[] genericArray){
		
		for(T element : genericArray){
			System.out.println(element + " ");
		}
	}

}
