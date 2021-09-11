import java.util.Scanner;

public class CF58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() <= 4) {
            System.out.println("NO");
        } else {
            StringBuilder sb = new StringBuilder("");
            int h = 1;
            int e = 1;
            int l = 2;
            int o = 1;
            for(int i = 0; i < s.length(); i++) {
                if(h > 0 && s.charAt(i) == 'h') {
                    sb.append('h');
                    h--;
                } else if(h == 0 && e > 0 && s.charAt(i) == 'e') {
                    sb.append('e');
                    e--;
                } else if(h == 0 && e == 0 && l > 0 && s.charAt(i) == 'l' ) {
                    sb.append('l');
                    l--;
                } else if(h == 0 && e == 0 && l == 0 && o > 0 && s.charAt(i) == 'o') {
                    sb.append('o');
                    o--;
                } else {
                    continue;
                }
            }
            if( "hello".equals(new String(sb))) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
