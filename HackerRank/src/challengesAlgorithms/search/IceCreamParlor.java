package challengesAlgorithms.search;

import java.util.*;

public class IceCreamParlor {
	
	static int[] icecreamParlor(int m, int[] arr) {
        int[] response = new int[2];
        response[0] = 1; 
		response[1] = 2;
        int j = 0, i = 1;
		while( i < arr.length ){
			//System.out.println("["+j+"]["+i+"] = "+arr[j] +" + "+ arr[i]);
			if(arr[j] + arr[i] == m){
				//System.out.print(arr[j] +" + "+arr[i]+" = " + m);
				response[0] = j+1; 
				response[1] = i+1; 
				break;
			} else if(i+1 == arr.length){
				j++;
                i = j;
			}
			i++;
		}
		//System.out.println("");
		return response;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }
}
