package challengesAlgorithms.warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
		int i, j, qtd_impresso = 1;
	    for(i=0; i<n; i++){
	    	for(j=0; j<n; j++){
	    		if(j >= n - qtd_impresso){
	    			System.out.printf("#");
	    		} else {
	    			System.out.printf(" ");
	    		}
	    	}
	    	System.out.println();
	    	qtd_impresso++;
	    }
	    
	    in.close();
	}

}
