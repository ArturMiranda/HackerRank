package challengesAlgorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
	    int[][] a = new int[n][n];
	    for(int a_i = 0; a_i < n; a_i++){
	       for(int a_j = 0; a_j < n; a_j++){
	          a[a_i][a_j] = in.nextInt();
	       }
	    }
	    
	   int sum_main_diagonal = 0, sum_secondary_diagonal = 0;
	   for(int indice = 0; indice < n; indice++){
			sum_main_diagonal +=  a[indice][indice];
			sum_secondary_diagonal +=  a[n-1-indice][indice];
	   }

	   System.out.println(Math.abs(sum_main_diagonal - sum_secondary_diagonal));
       in.close();
    }
	
}
