import java.util.Scanner;
public class CF231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int temp = 0;
            for(int j = 0; j < 3; j++) {
                if(sc.nextInt() == 1) temp++;
            }
            if(temp >= 2) ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}
