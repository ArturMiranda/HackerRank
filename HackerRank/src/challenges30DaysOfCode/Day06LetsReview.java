package challenges30DaysOfCode;

import java.util.Scanner;

public class Day06LetsReview {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, i;
        t = in.nextInt();
        String[] vetStrings = new String[t];
        in.nextLine();// Lendo pulo de linha
        for(i=0; i<t; i++){
            vetStrings[i] = in.nextLine();
        }
        
        String even, odd; 
        for(i=0; i<t; i++){
            int size = vetStrings[i].length();
            even = "";
            odd = "";
            for(int j=0; j<size; j++){
                if(j % 2 == 0){
                    even += vetStrings[i].charAt(j);    
                } else {
                    odd += vetStrings[i].charAt(j);    
                }
            }
            
            System.out.println(even +" "+odd );
        }
        in.close();
    }
}
