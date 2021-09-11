import java.util.Scanner;
public class CF339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long time = 0;
        long currPos = 1;
        long nextPos = 1;
        for(int i = 0; i < m; i++) {
            nextPos = sc.nextLong();

            if(nextPos >= currPos) {
                time += (nextPos - currPos);
            } else {
                time += ((n - currPos) + 1);
                currPos = 1;
                time += (nextPos - currPos);
            }
            currPos = nextPos;
        }
        System.out.println(time);
        sc.close();
    }
}
