import java.util.Scanner;

public class CF155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        if(n > 1) {
            for(int i = 1; i < n; i++) {
                boolean strictlyMore = checkMore(arr, n, i);
                boolean strictlyLess = checkLess(arr, n, i);
            
                if(strictlyMore || strictlyLess) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        sc.close();
    }

    private static boolean checkMore(int[] arr, int n, int i) {
        boolean flag = true;
        for(int j = 0; j < i; j++) {
            if(arr[j]>= arr[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    private static boolean checkLess(int[] arr, int n, int i) {
        boolean flag = true;
        for(int j = 0; j < i; j++) {
            if(arr[j]<= arr[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
