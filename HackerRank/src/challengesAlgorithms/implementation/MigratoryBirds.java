package challengesAlgorithms.implementation;

import java.util.Scanner;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
		// Complete this function
		int i;
		int indexMaior = 5, indexSegudoMaior = 5;
		int[] qtdEspecies = new int[6];
		for( i = 0; i < 6; i++)
			qtdEspecies[i] = 0;

		for( i = 0; i < n; i++){
			if(ar[i] == 1){
				qtdEspecies[0]++;
				if(qtdEspecies[indexMaior] < qtdEspecies[0]){
					indexSegudoMaior = indexMaior;
					indexMaior = 0;
				} else if(qtdEspecies[indexMaior] == qtdEspecies[0] && 1 < (indexMaior+1) ){
					indexSegudoMaior = indexMaior;
					indexMaior = 0;  
				} else if(qtdEspecies[indexSegudoMaior] < qtdEspecies[0] && qtdEspecies[0] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 0;
				} else if(qtdEspecies[indexSegudoMaior] == qtdEspecies[0] && 1 < (indexMaior+1) && qtdEspecies[0] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 0;  
				}
			} else if(ar[i] == 2){
				qtdEspecies[1]++;
				if(qtdEspecies[indexMaior] < qtdEspecies[1]){
					indexSegudoMaior = indexMaior;
					indexMaior = 1;
				} else if(qtdEspecies[indexMaior] == qtdEspecies[1] && 2 < (indexMaior+1) ){
					indexSegudoMaior = indexMaior;
					indexMaior = 1;  
				} else if(qtdEspecies[indexSegudoMaior] < qtdEspecies[1] && qtdEspecies[1] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 1;
				} else if(qtdEspecies[indexSegudoMaior] == qtdEspecies[1] && 2 < (indexSegudoMaior+1) && qtdEspecies[1] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 1;  
				}
			} else if(ar[i] == 3){
				qtdEspecies[2]++;
				if(qtdEspecies[indexMaior] < qtdEspecies[2]){
					indexSegudoMaior = indexMaior;
					indexMaior = 2;
				} else if(qtdEspecies[indexMaior] == qtdEspecies[2] && 3 < (indexMaior+1) ){
					indexSegudoMaior = indexMaior;
					indexMaior = 2;  
				} else if(qtdEspecies[indexSegudoMaior] < qtdEspecies[2] && qtdEspecies[2] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 2;
				} else if(qtdEspecies[indexSegudoMaior] == qtdEspecies[2] && 3 < (indexSegudoMaior+1) && qtdEspecies[2] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 2;  
				}
			} else if(ar[i] == 4){
				qtdEspecies[3]++;
				if(qtdEspecies[indexMaior] < qtdEspecies[3]){
					indexSegudoMaior = indexMaior;
					indexMaior = 3;
				} else if(qtdEspecies[indexMaior] == qtdEspecies[3] && 4 < (indexMaior+1) ){
					indexSegudoMaior = indexMaior;
					indexMaior = 3;  
				} else if(qtdEspecies[indexSegudoMaior] < qtdEspecies[3] && qtdEspecies[3] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 3;
				} else if(qtdEspecies[indexSegudoMaior] == qtdEspecies[3] && 4 < (indexSegudoMaior+1) && qtdEspecies[3] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 3;  
				}
			} else if(ar[i] == 5){
				qtdEspecies[4]++;
				if(qtdEspecies[indexMaior] < qtdEspecies[4]){
					indexSegudoMaior = indexMaior;
					indexMaior = 4;
				} else if(qtdEspecies[indexMaior] == qtdEspecies[4] && 5 < (indexMaior+1) ){
					indexSegudoMaior = indexMaior;
					indexMaior = 4;  
				} else if(qtdEspecies[indexSegudoMaior] < qtdEspecies[4] && qtdEspecies[4] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 4;
				} else if(qtdEspecies[indexSegudoMaior] == qtdEspecies[4] && 5 < (indexSegudoMaior+1) && qtdEspecies[4] != qtdEspecies[indexMaior]){
					indexSegudoMaior = 4;  
				}
			}

			//int result = qtdEspecies[indexSegudoMaior] + ((n - 1) - i);
			//System.out.println("=> "+qtdEspecies[indexMaior]+" > "+result+" => " +qtdEspecies[indexSegudoMaior]+"+(("+n+"-1)-"+i+")");
			//System.out.println("=> "+i);
			if(qtdEspecies[indexMaior] > qtdEspecies[indexSegudoMaior] + ((n - 1) - i) ){
				//System.out.println("=> "+qtdEspecies[indexMaior]+" > "+result+" => " +qtdEspecies[indexSegudoMaior]+"+(("+n+"-1)-"+i+")");
				break;
			}
		}
		return indexMaior + 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
		in.close();
	}

}
