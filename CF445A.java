import java.util.Scanner;

public class CF445A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] matrix = new char[n][m];

        for(int i = 0; i < n; i++) {
            String str = sc.next();
            for(int j = 0; j < m; j++) {
                matrix[i][j] = str.charAt(j);
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == '.') {
                    if((j + i) % 2 == 0) {
                        matrix[i][j] = 'B';
                    } else matrix[i][j] = 'W';
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
