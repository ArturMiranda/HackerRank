package challengesJava.Introduction;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int j, exp, si;
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
           
            si = a;
            for(j=0;j<n;j++){
                exp = (int) Math.pow(2,j);
                si += (exp * b);
                System.out.print(si+" ");
            }
            System.out.println();
        }
        
        in.close();
    }

}
