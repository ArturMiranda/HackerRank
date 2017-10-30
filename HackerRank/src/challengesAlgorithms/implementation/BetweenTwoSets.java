package challengesAlgorithms.implementation;

import java.util.Scanner;

public class BetweenTwoSets {
	static int getTotalX(int[] a, int[] b,int n, int m, int maxA, int minB) {
        // Complete this function
        int cont = 0;
        int i, a_i, b_i;
        
        // Maior divisor comum de B
        for(b_i = minB; b_i >= maxA; b_i--){
            for(i = 0; i < m; i++){
                if(b[i] % b_i != 0){
                    break;
                }
            }
            if(i == m){
                minB = b_i;
                break;
            }
        }
        
        for(i = minB; i >= maxA; i--){
            for(a_i = 0; a_i < n; a_i++){
                if(minB % i != 0 || i % a[a_i] != 0){
                    break;
                }
            }
            if(a_i == n){
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        
        int maxA = 0;
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a[a_i] > maxA){
                maxA = a[a_i];
            }
        }
        int[] b = new int[m];
        int minB = 100;
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b[b_i] < minB){
                minB = b[b_i];
            }
        }
        
        if( n < 1 || n > 10 || m < 1 || m > 10 || b[0] > 100){
           System.out.println("Entrada inválida!");
        } else {
        	int total = getTotalX(a, b, n, m, maxA, minB);
        	System.out.println(total);        	
        }
        
        in.close();
    }
}
