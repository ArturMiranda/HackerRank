package challengesWeekOfCode35;

import java.util.*;


public class ThreeDSurfaceArea {

	static int surfaceArea(int[][] A, int H, int W) {
        int i=0, j=0;
        int surface = 0;
        int neighborhoodSurface, stackSurface;
        for(i = 0; i < H; i++){
            for(j = 0; j < W; j++){
                
                neighborhoodSurface = 0;
                stackSurface = ((A[i][j] * 6) - (2 * (A[i][j] - 1)));
                if(i==0 && j==0){// superior esquerdo
                    if(W > 1) neighborhoodSurface =  (A[i][j] > A[i][j+1])? A[i][j+1]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i+1][j])? A[i+1][j]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                } else if(i==0 && j==W-1){// superior direito
                    if(W > 1) neighborhoodSurface =  (A[i][j] > A[i][j-1])? A[i][j-1]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i+1][j])? A[i+1][j]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                } else if(i==H-1 && j==0){// inferior esquerdo
                    if(H > 1) neighborhoodSurface =  (A[i][j] > A[i-1][j])? A[i-1][j]: A[i][j];
                    if(W > 1) neighborhoodSurface += (A[i][j] > A[i][j+1])? A[i][j+1]: A[i][j];;
                    surface += stackSurface - neighborhoodSurface;
                } else if(i==H-1 && j==W-1){// inferior direito
                    if(H > 1) neighborhoodSurface =  (A[i][j] > A[i-1][j])? A[i-1][j]: A[i][j];
                    if(W > 1) neighborhoodSurface += (A[i][j] > A[i][j-1])? A[i][j-1]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                } else if(i==0){// margem superior
                    if(W > 1) neighborhoodSurface =  (A[i][j] > A[i][j-1])? A[i][j-1]: A[i][j];
                    if(W > 1) neighborhoodSurface += (A[i][j] > A[i][j+1])? A[i][j+1]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i+1][j])? A[i+1][j]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                } else if(j==0){// margem esquerda
                    if(H > 1) neighborhoodSurface =  (A[i][j] > A[i-1][j])? A[i-1][j]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i+1][j])? A[i+1][j]: A[i][j];
                    if(W > 1) neighborhoodSurface += (A[i][j] > A[i][j+1])? A[i][j+1]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                } else if(j==W-1){// margem direita
                    if(W > 1) neighborhoodSurface =  (A[i][j] > A[i][j-1])? A[i][j-1]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i+1][j])? A[i+1][j]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i-1][j])? A[i-1][j]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                } else if(i==H-1){// margem inferior
                    if(W > 1) neighborhoodSurface =  (A[i][j] > A[i][j-1])? A[i][j-1]: A[i][j];
                    if(W > 1) neighborhoodSurface += (A[i][j] > A[i][j+1])? A[i][j+1]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i-1][j])? A[i-1][j]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                } else {// interior
                    if(W > 1) neighborhoodSurface =  (A[i][j] > A[i][j-1])? A[i][j-1]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i+1][j])? A[i+1][j]: A[i][j];
                    if(H > 1) neighborhoodSurface += (A[i][j] > A[i-1][j])? A[i-1][j]: A[i][j];
                    if(W > 1) neighborhoodSurface += (A[i][j] > A[i][j+1])? A[i][j+1]: A[i][j];
                    surface += stackSurface - neighborhoodSurface;
                }
            }
        }
        return surface;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A, H, W);
        System.out.println(result);
        in.close();
    }

}
