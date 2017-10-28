package challenges30DaysOfCode;

import java.util.Scanner;

public class Day02Operators {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */    

		double mealCost, totalCost;
	    int tipPercent, taxPercent;
	    
	    Scanner scan = new Scanner(System.in);
	    mealCost = scan.nextDouble();
	    tipPercent = scan.nextInt();
	    taxPercent = scan.nextInt();
	    
	    totalCost = Math.round(((tipPercent/100.0) * mealCost) + ((taxPercent/100.0) * mealCost)+mealCost);
	    System.out.println("The total meal cost is "+(int) totalCost+" dollars.");

		scan.close();
	    
	}

}
