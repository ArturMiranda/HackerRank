package challenges30DaysOfCode;

import java.util.Scanner;

public class Day25RunningTimeAndComplexity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] numbers = new long[T];
		
		for(int i=0; i<T; i++){
			numbers[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<T; i++){
			count = 0;
			long number = numbers[i];
	        for( int j=1; j<=(int)(Math.sqrt(number)) && count<2; j++ ){
	             if( number % j == 0 ){
	                 count++;
	             }     
	        }
	        if( count < 2 && number != 1 ){
	           System.out.println("Prime");
	        }
	        else{
	        	System.out.println("Not prime");
	        }
		}
		sc.close();
	}

}
