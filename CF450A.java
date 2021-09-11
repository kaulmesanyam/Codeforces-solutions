import java.util.*;
public class CF450A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int candies = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        int lastRem = 0;
        int totalZeros = 0;
        while(true) {
            totalZeros = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] > candies) {
                    arr[i] = arr[i] - candies;
                } else if(arr[i] > 0 && arr[i]  <= candies) {
                    lastRem = i;
                    arr[i] = 0;
                    totalZeros++;
                } else if(arr[i] == 0) {
                    totalZeros++;
                }
            }
            if(totalZeros == n) break;
        }
        
        System.out.println(lastRem + 1);
        sc.close();
    }
}
