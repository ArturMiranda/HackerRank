package challengesJava.Introduction;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else{
            if( (n >= 2 && n <= 5) || (n > 20 )){
                ans = "Not Weird ";
            } else {
                ans = "Weird";
            }
        }
        System.out.println(ans);
        sc.close();
        
    }

}
