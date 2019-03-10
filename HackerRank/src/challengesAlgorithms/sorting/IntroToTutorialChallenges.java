package challengesAlgorithms.sorting;

// Reference: https://www.hackerrank.com/challenges/tutorial-intro/problem
import java.util.*;

public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int n = in.nextInt();
		List<Integer> ar = new ArrayList<Integer>();

		for(int i=0; i < n; i++){
			ar.add(in.nextInt());
		}

		System.out.println(ar.indexOf(v));
		in.close();
	}

}
