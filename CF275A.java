import java.util.Scanner;
public class CF275A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[3][3];
        int[][] ans = { {1,1,1},
                        {1,1,1},
                        {1,1,1}
                    };

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                input[i][j] = sc.nextInt()%2;
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j< 3; j++) {
                if(input[i][j] == 1) {
                    if(ans[i][j] == 1) ans[i][j] = 0;
                    else ans[i][j] = 1;
                    if(i+1 < 3) {
                        if(ans[i +1][j] == 1) ans[i+1][j] = 0;
                        else ans[i+1][j] = 1;
                    }
                    if(j+1 < 3) {
                        if(ans[i][j+1] == 1) ans[i][j+1] = 0;
                        else ans[i][j+1] = 1;
                    }
                    if(i-1 >= 0) {
                        if(ans[i-1][j] == 1) ans[i-1][j] = 0;
                        else ans[i-1][j] = 1;
                    }
                    if(j-1 >= 0) {
                        if(ans[i][j-1] == 1) ans[i][j-1] = 0;
                        else ans[i][j-1] = 1;
                    }
                    
                }  
            }
        }

        for(int i = 0; i< 3; i++) {
            for(int j=0 ; j < 3; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
