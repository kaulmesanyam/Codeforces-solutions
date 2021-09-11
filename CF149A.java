import java.util.Scanner;
import java.util.Arrays;
public class CF149A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if(k == 0) System.out.println(0);
        else {
            int[] arr = new int[12];
            for(int i = 0; i < 12; i++) {
                arr[i] = sc.nextInt(); 
            }
            Arrays.sort(arr, 0, 12);
            int count = 0;
            int sum = 0;
            for(int i = 11; i >= 0; i--) {
                sum += arr[i];
                count++;
                if(sum >= k) break;
            }
            if(sum >= k) System.out.println(count);
            else System.out.println(-1);
        }
        sc.close();
    }
}
