package challengesDataStructures.arrays;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        long[] entrada = new long[n];
        for(int i = 0; i < n; i++){
        	entrada[i] = 0;
	    }
        long maxValue = 0;
        
        for(int a0 = 0; a0 < m; a0++){
        	int a = in.nextInt();
            int b = in.nextInt();
            long k = in.nextInt();
            
            for(int i = a - 1; i < b; i++){
				entrada[i] += k;
				if(entrada[i] > maxValue) maxValue = entrada[i];
			}
        }
        
        System.out.println(maxValue);
		in.close();
	}

}
