package challengesAlgorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

	static int[] solve(int[] grades,int n){
		// Complete this function
		int[] result = new int[n];
		for(int grades_i=0; grades_i < n; grades_i++){

			if(grades[grades_i] <= 37 || (grades[grades_i] % 5 == 0) ){
				result[grades_i] = grades[grades_i];
			} else {
				int aux = grades[grades_i];
				while(aux % 5 != 0){
					aux++;
				}
				if(aux - grades[grades_i] < 3){
					result[grades_i] = aux; 
				} else {
					result[grades_i] = grades[grades_i];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];

		for(int grades_i=0; grades_i < n; grades_i++){
			grades[grades_i] = in.nextInt();
		}

		int[] result = solve(grades, n);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}

		System.out.println("");
		in.close();
	}

}
