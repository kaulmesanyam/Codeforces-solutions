import java.util.Scanner;

public class CF248A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int leftClosed = 0;
        int rightOpened = 0;
        for(int i = 0; i < n; i++) {
            int door = sc.nextInt();
            if(door == 0) leftClosed++;
            door = sc.nextInt();
            if(door == 1) rightOpened++;
        }
        int ans = 0;
        if((leftClosed == n && rightOpened == n) || (leftClosed == 0 && rightOpened == 0) || (leftClosed == n && rightOpened == 0) || (leftClosed == 0 && rightOpened == n)) {
            ans = 0;
        } 
         else {
            if(leftClosed <= (n - leftClosed) && (leftClosed != 0 || leftClosed != n)) {
                ans += leftClosed;
            }
            if(rightOpened < (n - rightOpened) &&(rightOpened != 0 || rightOpened != n)) {
                ans += rightOpened;
            } if(leftClosed > (n - leftClosed) && (leftClosed != 0 || leftClosed != n)) {
                ans += (n -leftClosed);
            }
            if(rightOpened >= (n - rightOpened) &&(rightOpened != 0 || rightOpened != n)) {
                ans += (n - rightOpened);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
