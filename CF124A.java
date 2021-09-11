import java.util.Scanner;
public class CF124A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int probPos = a + 1;
        int count = 1;
        int behind = n - probPos;
        
        while(behind > b) {
            probPos++;
            behind = n - probPos;
        }

        while(probPos != n) {
            count++;
            probPos++;
        }

        System.out.println(count);
        sc.close();
    }
}
