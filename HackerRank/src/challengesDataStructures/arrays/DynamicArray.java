package challengesDataStructures.arrays;

import java.util.*;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		long lastAnswer = 0;
		
		List<Long> Seq0 = new ArrayList<Long>();
		List<Long> Seq1 = new ArrayList<Long>();
		int queryType, oldQuery = 0;
		
		for(int i=0; i<q; i++){
			queryType = in.nextInt();
			long x = in.nextInt();
			long y = in.nextInt();
			
			if(queryType == 1){
				System.out.println("Query "+i+": Append "+y+" to sequence ("+x+"^"+lastAnswer+" % "+n+") = "+ (x ^ lastAnswer % n) );
				if((x ^ lastAnswer % 2) == 0){
					Seq0.add(y);					
				} else {
					Seq1.add(y);										
				}
				oldQuery = queryType;
			} else {
				System.out.println("Query "+i+": Append "+y+" to sequence ("+x+"^"+lastAnswer+" % "+n+") = "+ (x ^ lastAnswer % n) );
				System.out.println("Find the value of element "+y+" % "+Seq1.size()+" = "+ (y % Seq1.size()) );
				
				//if(oldQuery != queryType){
					//System.out.println("lastAnswer: "+ lastAnswer );
				//}
				
				lastAnswer = (y % Seq1.size());
				
				System.out.println("lastAnswer: "+ lastAnswer );
			}
			System.out.println("Seq1: "+ Seq0.toString() );
			System.out.println("Seq2: "+ new HashSet<>(Seq1).toString() );
			
			
		}


		in.close();
	}

}
