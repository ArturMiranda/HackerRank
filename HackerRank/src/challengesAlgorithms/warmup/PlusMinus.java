package challengesAlgorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arr = new int[n];
        int positives=0, negatives=0, zeroes=0;
        for(int arr_i = 0; arr_i < n; arr_i++){
        	arr[arr_i] = in.nextInt();
        	if(arr[arr_i] > 0){
        		positives++;
        	} else if(arr[arr_i] < 0){
        		negatives++;
        	} else {
        		zeroes++;
        	}
        }
        float qtd = (float) (n * 1.0);
        
        System.out.printf("%.6f\n", (float)(positives/qtd));
        System.out.printf("%.6f\n", (double)(negatives/qtd));
        System.out.printf("%.6f\n", (double)(zeroes/qtd));
        in.close();
    }

    
}
