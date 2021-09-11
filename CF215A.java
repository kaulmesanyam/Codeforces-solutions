import java.util.Scanner;

public class CF215A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr1= new long[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        long[] arr2= new long[m];

        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        long max = 0;
        int count = 0;
        for(int j = m - 1; j >= 0; j--) {
            long bj = arr2[j];
            for(int i = 0; i < n; i++) {
                long ai = arr1[i];
                if(bj%ai == 0) {
                    long integer = bj/ai;
                    if(integer > max) {
                        max = integer;
                        count = 1;
                    } else if(integer == max) count++;
                    else continue;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
