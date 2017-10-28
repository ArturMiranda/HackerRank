package challengesAlgorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

    
    static String timeConversion(String s) {
    	// Complete this function
    	String periodo = s.substring(s.length()-2,s.length());
    	String hora = s.substring(0,2);
    	String nova_hora = "";
    	
    	if(periodo.equals("AM") && hora.equals("12")){
    		nova_hora = "00" + s.substring(2,s.length()-2);
    	} else if(periodo.equals("PM") && !hora.equals("12")){
    		int newHora = Integer.parseInt(hora) + 12;
    		nova_hora = newHora + s.substring(2,s.length()-2);
    	} else {
    		nova_hora = s.substring(0,s.length()-2);
    	}
    	
    	return nova_hora;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
        in.close();
    }
    

}
