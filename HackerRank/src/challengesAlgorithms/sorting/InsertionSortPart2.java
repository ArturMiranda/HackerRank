package challengesAlgorithms.sorting;

// Reference: https://www.hackerrank.com/challenges/insertionsort2/problem
import java.util.Scanner;

public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar){       
		int size = ar.length;
		for(int i=0; i<size-1; i++){
			if(ar[i+1] < ar[i]){
				int tmp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = tmp;
				
				for(int j=0; j<i; j++){
					if(ar[i] < ar[j]){
						int aux = ar[j];
						ar[j] = ar[i];
						ar[i] = aux;
					}
				}
			}
			printArray(ar);
		}
	}  

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertionSortPart2(ar);    
		in.close();
	}    
	
	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}

}
