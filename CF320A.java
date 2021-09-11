import java.util.Scanner;
public class CF320A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        boolean flag = true;
        int i = 0;
       {
            while(i < n.length()) {
                if(n.charAt(i) != '1') {
                    flag = false;
                    break;
                } else {
                    if(( (i + 1 < n.length()) && n.charAt(i + 1) == '4') && ( (i + 2 < n.length()) && n.charAt(i + 2) == '4')) {
                        i = i + 3;
                    } else if((i + 1 < n.length() ) && n.charAt(i + 1) == '4') {
                        i = i + 2;
                    } else {
                        i = i + 1;
                    }
                }
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
