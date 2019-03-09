package challenges30DaysOfCode;

import java.util.*;
import java.util.regex.Pattern;


public class Day28RegExPatternsAndIntroToDatabases {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
				
		//TreeSet<String> orderNames = new TreeSet<String>();
		List<String> orderNames = new ArrayList<String>();
		String regex = "@gmail.com";
		Pattern pattern = Pattern.compile(regex);
		
		for(int i=0; i<n; i++){
			String input = in.nextLine();
			if(pattern.matcher(input).find()){
				String[] names = input.split("\\s+");
				orderNames.add(names[0]);				
			}
		}

		Collections.sort(orderNames);
		for (String s : orderNames) {
		    System.out.println(s);
		}
		in.close();
	}

}
