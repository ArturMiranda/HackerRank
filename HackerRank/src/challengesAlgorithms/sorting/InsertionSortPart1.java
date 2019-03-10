package challengesAlgorithms.sorting;

import java.util.Scanner;

// Reference: https://www.hackerrank.com/challenges/insertionsort1/problem

public class InsertionSortPart1 {

	public static void insertIntoSorted(int[] ar) {

		int size = ar.length;
		int lastOne = ar[size-1];
		boolean myBreak = false;
		for(int i=1; i<size && !myBreak; i++){
			if(ar[size-i-1] > lastOne){
				ar[size-i] = ar[size-i-1];
			} else {
				ar[size-i] = lastOne;
				myBreak = true;
			}
			for(int j=0; j<size; j++){
				System.out.print(ar[j] + " ");
			}
			System.out.println();
			printArray(ar); 
		}
	}


	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		insertIntoSorted(ar);
		in.close();
	}


	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}

}
