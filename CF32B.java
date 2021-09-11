import java.util.*;

public class CF32B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String borze = sc.nextLine();

        int len = borze.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while ( i < len) {
            if(borze.charAt(i) == '.'){
                sb.append(0);
                i++;
            } 
            else {
                if(borze.charAt(i + 1) == '.') {
                    sb.append(1);
                } else {
                    sb.append(2);
                }
                i = i + 2;
            } 
        }
        System.out.println(sb);
        sc.close();
    }  
}
