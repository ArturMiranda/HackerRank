package challenges30DaysOfCode;

import java.util.Scanner;

public class Day20Sorting {
	
	static int[] a;
	
	public static int swap(int indiceMax, int indiceMin){
		int aux = a[indiceMax];
		a[indiceMax] = a[indiceMin];
		a[indiceMin] = aux;
		
		return 1;
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        
        int swaps = 0;
        
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;
            
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                	swaps += swap(j, j + 1);
                    numberOfSwaps++;
                }
            }
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        in.close();
    }

}
