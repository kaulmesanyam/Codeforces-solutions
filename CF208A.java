import java.util.Scanner;
public class CF208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length; i++) {
            if(str[i] == 'W' && (i + 1 < str.length && str[i+1] == 'U') && (i + 2 < str.length && str[i+2] == 'B')){
                if((sb.length() != 0) && (sb.charAt(sb.length() - 1) != ' ')) {
                    sb.append(" ");
                }
                i = i + 2;
            }else {
                sb.append(str[i]);
            }
        }
        System.out.println(new String(sb));
        sc.close();
    }
}
