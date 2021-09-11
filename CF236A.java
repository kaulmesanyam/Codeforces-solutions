import java.util.*;

public class CF236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < n.length(); i++) {
            set.add(n.charAt(i));
        }
        if(set.size()%2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
