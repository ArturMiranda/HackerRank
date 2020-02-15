package challenges10DaysOfStatistics;

import java.util.Scanner;

public class Day00WeightedMean {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] n = new int[x];
        int[] w = new int[x];
        
        for(int a_i=0; a_i < x; a_i++){
            n[a_i] = in.nextInt();
        }
        int weight = 0;
        for(int a_i=0; a_i < x; a_i++){
            w[a_i] = in.nextInt();
            weight += w[a_i];
        }
        
        double weighted = 0.0;
        for(int a_i=0; a_i < x; a_i++){
        	weighted += n[a_i] * w[a_i];
        }
        
        System.out.println( (double)(Math.round(weighted/weight * 10.0)/10.0) );
        in.close();
	}

}
