package challengesAlgorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();

		if((a < s && s < t && t < b)){
			int[] apple = new int[m];
			int applesInRange = 0, applesDistance;
			for(int apple_i=0; apple_i < m; apple_i++){
				apple[apple_i] = in.nextInt();

				applesDistance = a + (apple[apple_i]);
				if(applesDistance >= s && applesDistance <= t){
					applesInRange++;
				}
			}

			int[] orange = new int[n];
			int orangesInRange = 0, orangesDistance;
			for(int orange_i=0; orange_i < n; orange_i++){
				orange[orange_i] = in.nextInt();

				orangesDistance = b + (orange[orange_i]);
				if(orangesDistance >= s && orangesDistance <= t){
					orangesInRange++;
				}
			}

			System.out.println(applesInRange);
			System.out.println(orangesInRange);
			in.close();
		} else {
			System.out.println("Entrada inválida!");        	
		}
	}

}
