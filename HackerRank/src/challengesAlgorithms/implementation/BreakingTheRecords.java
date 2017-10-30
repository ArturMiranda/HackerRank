package challengesAlgorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger[] s = new BigInteger[n];
        BigInteger bestScore = BigInteger.ZERO, lowerScore = BigInteger.ZERO;
        int contBest = 0, contLower = 0;
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextBigInteger();
            
            if(s_i == 0){
                bestScore = s[s_i];
                lowerScore = s[s_i];
            } else {
                if(s[s_i].compareTo(bestScore) > 0 ){
                    bestScore = s[s_i];
                    contBest++;
                }
                
                if(s[s_i].compareTo(lowerScore) == -1){
                    lowerScore = s[s_i];
                    contLower++;
                }
            }
        }
        System.out.println(contBest+" "+contLower);
        in.close();
    }

}
