import java.util.*;

public class CF263A {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< 5; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }     
        }
        
        for(int i = 0; i< 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[i][j] == 1) {
                    int ans = Math.abs(3 - (i + 1)) + Math.abs(3 - (j + 1));
                    System.out.println(ans);
                    break;
                }
            }     
        }
        
        sc.close();
    }  
}
