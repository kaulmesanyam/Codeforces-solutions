import java.util.Scanner;
public class CF139A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        for(int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        
            for(int i = 0; ; i++) {
                int day = i % 7;
                n = n - arr[day];
                if(n <= 0) {
                    System.out.println(day + 1);
                    break;
                }
            }
        
        sc.close();
    }
}
