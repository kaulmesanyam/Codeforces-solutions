import java.util.Scanner;

public class CF34A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = 1000;
        int x = 0; 
        int y = 0;
        for(int i = 0; i < n -1 ; i++) {
            if(Math.abs(arr[i] - arr[i + 1]) < min) {
                min = Math.abs(arr[i] - arr[i + 1]);
                x = i + 1;
                y = i + 1 + 1;
            }
        }

        if(Math.abs(arr[0] - arr[n - 1]) < min) {
            x = n;
            y = 1;
        }
        System.out.println(x + " " + y);
        sc.close();
    }
}
