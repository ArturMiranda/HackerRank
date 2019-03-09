package challenges10DaysOfStatistics;

import java.util.*;

public class Day00MeanMedianAndMode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        int sum=0;
        Map<Integer,Integer> mode = new HashMap<Integer,Integer>();
        int mapKeyMode = 0;
        
        for(int i=0; i<n; i++){
        	numbers[i] = in.nextInt();
        	sum += numbers[i];
        	if(mode.containsKey(numbers[i])){
        		int increment = mode.get(numbers[i]) + 1;
        		mode.put(numbers[i], increment);
        	} else {
        		mode.put(numbers[i], 1);
        	}
        	
        	if(mode.get(mapKeyMode) == null || mode.get(mapKeyMode) < mode.get(numbers[i])){
    			mapKeyMode = numbers[i];
    		} else if(mode.get(mapKeyMode) == mode.get(numbers[i]) && mapKeyMode > numbers[i] ){
    			mapKeyMode = numbers[i];
    		}
        }
        
        Arrays.sort(numbers);
        
        System.out.format("%.1f\n", (sum/(float)n) );// Mean
        if(n % 2 == 0 )
        	System.out.format("%.1f\n", ((numbers[(n-1)/2] + numbers[(n)/2])/2.0) );// Median
        else 
        	System.out.format("%.1f\n", (numbers[n/2]/1.0) );// Median
        System.out.println(mapKeyMode);// Mode
        in.close();
	}

}
