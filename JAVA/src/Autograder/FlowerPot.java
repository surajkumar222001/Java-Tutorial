
import java.util.Scanner;

public class FlowerPot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int L = scanner.nextInt(); 
        int W = scanner.nextInt();
        int[][] A = new int[L][W]; 
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        int H = scanner.nextInt(); 

        
        int placementRow = -1;
        int placementCol = -1;

        
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < W; j++) {
                if (A[i][j] >= H) {
                    placementRow = i;
                    placementCol = j;
                     break;
                }
            }
            if (placementRow != -1) {
                break;
            }
        }

        
        if (placementRow == -1) {
            placementRow = L - 1;
            placementCol = W - 1;
        }

      
        System.out.println((placementRow  ) + " " + (placementCol  )); 
    }
}
