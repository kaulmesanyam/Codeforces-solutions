import java.util.*;
public class CF151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int a1 = (k*l)/nl;
        int a2 = c*d;
        int a3 = p/np;

        System.out.println(Math.min(a1,Math.min(a2,a3))/n);
        sc.close();
    }
}
