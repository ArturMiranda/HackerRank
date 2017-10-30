package challengesAlgorithms.implementation;

import java.util.Scanner;

public class BirthdayChocolate {

	static int solve(int n, int[] s, int d, int m){
		// Complete this function
		int i, j, sumPice, contPice = 0;
		for( i=0; i < n; i++){
			sumPice = 0;
			for(j=i; j < i+m && j < n; j++){
				sumPice += s[j];    
			}
			if(sumPice == d){
				contPice++;
			}
		}
		return contPice;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int s_i=0; s_i < n; s_i++){
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		System.out.println(result);
		in.close();
	}

}
