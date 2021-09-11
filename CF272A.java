import java.util.Scanner;
public class CF272A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fingers = 0;
        for(int i = 0; i < n; i++) {
            fingers += sc.nextInt();
        }
        int ans = 0;
        for(int i = fingers + 1; i <=fingers + 5 ; i++) {
            if(i % (n + 1) == 1) continue;
            else ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}