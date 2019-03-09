package challenges30DaysOfCode;

import java.util.*;

public class Day26NestedLogic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // Book returned
		int Da = scanner.nextInt();
        int Ma = scanner.nextInt();
        int Ya = scanner.nextInt();
        // Expected
        int De = scanner.nextInt();
        int Me = scanner.nextInt();
        int Ye = scanner.nextInt();
			
		int fine;
		if(Ya > Ye){
			fine = 10000;	
		} else if(Da > De && Ma == Me && Ya == Ye){
			fine = (int) (15 * (Da - De));
		} else if(Ma > Me && Ya == Ye){
			fine = (int) (500 * (Ma - Me));		
		} else {
			fine = 0;							
		}
			
		System.out.println(fine);
		scanner.close();
	}

}
