import java.util.Scanner;

public class CF221A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for(int i = n - 1; i > 0; i = i - 1) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }

        for(int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[n-1]);
        sc.close();
    }
}
