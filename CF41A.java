import java.util.Scanner;
public class CF41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] t = sc.next().toCharArray();
        char[] s = sc.next().toCharArray();
        boolean flag = true;

        if(t.length != s.length) {
            flag = false;
        }
        else {
            for(int i = 0; i < t.length; i++) {
                if(t[i] != s[t.length - i - 1]) {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
 