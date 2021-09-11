import java.util.Scanner;
public class CF80A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(!isPrime(m)) System.out.println("NO");
        else {
            boolean flag = true;
            for(int i = n + 1; i < m; i++) {
                if(isPrime(i)){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= n/2; i++) {
            if(n%i == 0) return false;
        }

        return true;
    }
}
