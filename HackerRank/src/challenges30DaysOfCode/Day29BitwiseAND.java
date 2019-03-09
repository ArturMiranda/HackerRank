package challenges30DaysOfCode;

import java.util.Scanner;

public class Day29BitwiseAND {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int max;
        
        for(int i=0; i<t; i++){
        	int n = in.nextInt();
        	int k = in.nextInt();
        	
        	max = 0;
        	for(int j=1; j<=n; j++){
        		for(int z=j+1; z<=n; z++){
        			int bitwise = (j & z);
        			if(bitwise > max && bitwise < k){
        				max = bitwise;
        			}
        		}
        	}
        	System.out.println(max);
        }
        in.close();
	}

}
