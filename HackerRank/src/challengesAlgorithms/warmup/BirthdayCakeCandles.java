package challengesAlgorithms.warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	static int birthdayCakeCandles(int n, int ar_size, int[] ar, int tallestCandle) {
		// Complete this function
		int contCandles = 0;
		for(int ar_i = 0; ar_i < n; ar_i++){
			if(tallestCandle == ar[ar_i]) contCandles++;
		}
		return contCandles;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] ar = new int[n];
		int tallestCandle = 0;
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
			if(tallestCandle < ar[ar_i]) tallestCandle = ar[ar_i];
		}

		int result = birthdayCakeCandles(n, n, ar, tallestCandle);
		System.out.println(result);
		in.close();
	}

}
