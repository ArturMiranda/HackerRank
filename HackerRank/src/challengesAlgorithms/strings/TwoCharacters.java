package challengesAlgorithms.strings;

import java.util.*;
import java.util.regex.*;

public class TwoCharacters {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        Set<String> carcters = new HashSet<String>(Arrays.asList(s.split("")));
        
        String regex = "^([a-z])(?!\\1)([a-z])(?:\\1\\2)*\\1?$";
        String regexReplace = "X";
        String replace = "";
        
        Pattern pattern, patternReplace;
        Matcher matcher, matcherReplace;
        
        int size = 0;

        pattern = Pattern.compile(regex);
		matcher = pattern.matcher(s);
        if(matcher.find()){
    		size = s.length();
    		System.out.println("size: "+size);
    	}
       
    	for(String car: carcters){
    		regexReplace = car;
    		patternReplace = Pattern.compile(regexReplace);
    		matcherReplace = patternReplace.matcher(s);
    		String str = matcherReplace.replaceAll(replace);
    		
    		pattern = Pattern.compile(regex);
    		matcher = pattern.matcher(str);
    		
    		System.out.println("------------------------------");
    		System.out.println("str: "+str);
        	if(matcher.find() && str.length() > size){
        		size = str.length();
        		System.out.println("size: "+size);
        	}
    	}
    	
        System.out.println("------------------------------");
        System.out.println(size);
        in.close();
    }

}
