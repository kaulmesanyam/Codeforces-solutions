import java.util.Scanner;
public class CF96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int maxCount0 = 0;
        int maxCount1 = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                int temp = consecNum('0', i, str);
                if( temp > maxCount0) maxCount0 = temp;
            } else {
                int temp = consecNum('1', i, str);
                if(temp > maxCount1) maxCount1 = temp;
            }
        }
        if(maxCount0 >= 7 || maxCount1 >= 7) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

    private static int consecNum(char n, int k, String str) {
        int temp = 1;
        for(int i = k + 1; i < str.length(); i++) {
            if(str.charAt(i) == n) temp++;
            else break;
        }
        return temp;
    }
}
