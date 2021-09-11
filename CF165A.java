import java.util.Scanner;

public class CF165A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] xn = new int[n];
        int[] yn = new int[n];
        int ans = 0;

        for(int i = 0; i < n; i++) {
            xn[i] = sc.nextInt();
            yn[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int x = xn[i];
            int y = yn[i];
            boolean left = false;
            boolean right = false;
            boolean top = false;
            boolean bottom = false;
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    int x1 = xn[j];
                    int y1 = yn[j];

                    if(x == x1 && y < y1) {
                        top = true;
                    }
                    if(x == x1 && y > y1) {
                        bottom = true;
                    }
                    if(y == y1 && x < x1) {
                        right = true;
                    }
                    if(y == y1 && x > x1) {
                        left = true;
                    }

                    if(top && bottom && left && right) {
                        ans++;
                        break;
                    }
                }
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}
