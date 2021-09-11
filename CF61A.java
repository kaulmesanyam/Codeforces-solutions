import java.util.*;
public class CF61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 != 0) System.out.println(-1);
        else {
            int[] arr = new int[n];
            for(int i = 0; i < n; i++ ) {
                arr[i] = i + 1;
            }

            for(int i = 0; i < n - 1; i = i + 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            for(int i : arr) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}
