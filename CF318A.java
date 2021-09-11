import java.util.*;

public class CF318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(k <= (n + 1)/2) {
            System.out.println(2*k - 1);
        } else {
            System.out.println((k - (n + 1)/2)*2);
        }
        sc.close();
    }

}
