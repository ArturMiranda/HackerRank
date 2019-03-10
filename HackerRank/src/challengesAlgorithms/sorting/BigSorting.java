package challengesAlgorithms.sorting;

import java.util.Scanner;

public class BigSorting {

	// Split in two arrays
	public static void split(String[] vet, String[] leftArray, String[] rightArray, int len){
		int i_left=0, i_right=0;
		for(int i=0; i<len; i++){
			if(i < (int) len/2){
				leftArray[i_left] = vet[i];
				i_left++;
			} else {
				rightArray[i_right] = vet[i];
				i_right++;
			}
		}		
	}

	// Merge ordered arrays
	public static String[] merge(String[] vetLeft, String[] vetRight, int i_left, int i_right) {
		int left=0, right=0;
		String[] vetCombined = new String[(i_left + i_right)];

		for(int i=0; i<(i_left + i_right); i++){
			if(left<i_left && right<i_right && right<i_right && vetLeft[left].length() < vetRight[right].length() ){
				vetCombined[i] = vetLeft[left++];
			} else if(left<i_left && right<i_right && right<i_right && vetLeft[left].length() > vetRight[right].length() ){

				vetCombined[i] = vetRight[right++];
			} else {
				if(left<i_left && (right==i_right || (vetLeft[left].compareTo(vetRight[right]) < 0) )){
					vetCombined[i] = vetLeft[left++];
				} else if(right<i_right){
					vetCombined[i] = vetRight[right++];
				}
			}



		}
		return vetCombined;
	}

	// Merge Sort
	public static String[] mergeSort(String[] vet, int len){

		int leftSize = len/2;
		int rightSize = (len % 2 == 1)? leftSize + 1: leftSize;

		String[] vetOrdered;
		String[] leftArray = new String[leftSize];
		String[] rightArray = new String[rightSize];

		if(len == 1){
			return vet;
		} else {
			// Split vet in two arrays
			split(vet,leftArray,rightArray, len);
			// Recursive call for left array
			leftArray = mergeSort(leftArray, leftSize);
			// Recursive call for right array
			rightArray = mergeSort(rightArray, rightSize);
			// Merge ordered the arrays
			vetOrdered = merge(leftArray, rightArray, leftSize, rightSize);
		}

		return vetOrdered;
	}

	// Print Arrays
	public static void printArray(String[] vetOrdered, int n){

		for(int i=0; i<n; i++){
			System.out.println(vetOrdered[i]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
			unsorted[unsorted_i] = in.next();
		}
		// your code goes here
		String[] ordered = mergeSort(unsorted, n);
		printArray(ordered, n);
		in.close();
	}

}
