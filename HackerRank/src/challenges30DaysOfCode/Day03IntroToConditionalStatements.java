package challenges30DaysOfCode;

import java.util.Scanner;

public class Day03IntroToConditionalStatements {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
	    
	    if(N % 2 == 1){
	        System.out.println("Weird");
	    } else {
	        if(N < 5 || 20 < N){
	        	System.out.println("Not Weird");
	        } else {
	        	System.out.println("Weird");
	        }
	    }
	    in.close();
	}

}
