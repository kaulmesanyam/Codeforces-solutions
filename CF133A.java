
import java.util.*;
public class CF133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> set = new HashSet<>();

        set.add('H');
        set.add('Q');
        set.add('9');
        //set.add('+');

        boolean flag = false;
        for(int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))) {
                flag = true;
                break;
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
