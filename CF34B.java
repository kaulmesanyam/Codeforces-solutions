import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CF34B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int total = 0;
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp < 0) arr.add(temp);
        }
        
        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
            m--;
            if(m == 0) break;
        }
        System.out.println(-1*total);
        sc.close();
    }
}
