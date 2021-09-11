import java.util.Scanner;
public class CF352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fives = 0;
        int zeros = 0;

        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if(t == 5) fives++;
            if(t == 0) zeros++;
        }
        if(zeros == 0) System.out.println(-1);
        else if(fives < 9) System.out.println(0);
        else {
            fives = fives - (fives%9);
            for(int i = 0; i< fives; i++) {
                System.out.print(5);
            }
            for(int i = 0; i< zeros; i++) {
                System.out.print(0);
            }
        }
        sc.close();
    }
}
