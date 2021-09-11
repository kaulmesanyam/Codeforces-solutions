import java.util.Scanner;
public class CF71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            if(str.length() > 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                int num = str.length() - 2;
                sb.append(num);
                sb.append(str.charAt(str.length() - 1));
                System.out.println(new String(sb));
            } else {
                System.out.println(str);
            }
        }
        sc.close();
    }
}
