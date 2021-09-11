import java.util.Scanner;
import java.util.HashMap;
public class CF227B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        HashMap<Long, Long> map = new HashMap<>();

        for(long i = 0; i < n; i++) {
            long num = sc.nextInt();
             map.put(num, i);
        }

        long x = sc.nextInt();
        long V = 0;
        long P = 0;
        for(long i = 0; i < x; i++) {
            long num = sc.nextInt();
            long temp = map.get(num) + 1;
            V = V + temp;
            P = P + (n - temp) + 1;
        }
        System.out.println(V + " " + P);
        sc.close();
    }
}
