package challenges10DaysOfStatistics;

import java.util.Scanner;

public class StandardDeviation {

	public static double calcStandardDeviation(int[] values, double mean) {
		double sum = 0.0;
		
		for(int i=0; i<values.length ; i++){
        	sum += Math.pow( (values[i]-mean), 2.0);
        } 
		return Math.sqrt( sum/values.length );
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] x = new int[n];
        int sum = 0;
        double mean = 0.0;
        
        for(int i=0; i<n; i++){
        	x[i] = input.nextInt();
        	sum += x[i];
        } 
        mean = sum/n;
        
        double standardDeviation = calcStandardDeviation(x, mean);
        System.out.println(  (double) Math.round(standardDeviation * 10) / 10 );

        input.close();
	}

}
