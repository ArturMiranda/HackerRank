package challengesAlgorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long min_sum, max_sum, aux_sum = 0;
        int indice_out = 0;
        min_sum = arr[0] + arr[1] + arr[2] + arr[3];
        max_sum = arr[0] + arr[1] + arr[2] + arr[3];
        
        for(int arr_i = 0; arr_i < 5; arr_i++){
        	aux_sum = 0;
        	for(int i = 0; i < 5; i++){
        		if(i != indice_out){
        			aux_sum += arr[i];
        		}
        	}
        	
        	if(aux_sum > max_sum){
        		max_sum = aux_sum;
        	}
        	
        	if(aux_sum < min_sum){
        		min_sum = aux_sum;
        	}
        	indice_out++;
        }
        
        System.out.println(min_sum+" "+max_sum);
        in.close();
	}

}
