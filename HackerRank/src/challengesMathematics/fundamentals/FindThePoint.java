package challengesMathematics.fundamentals;

import java.util.*;

public class FindThePoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			int x0 = sc.nextInt();
			int y0 = sc.nextInt();
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			
			int rx = 2*x1 - x0;
			int ry = 2*y1 - y0;
			System.out.println( rx+" "+ry);
			
		}
		
		sc.close();
	}
}
