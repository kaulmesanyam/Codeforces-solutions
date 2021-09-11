import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class CF228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 4; i++) {
            set.add(sc.nextInt());
        }       
        int ans = 4 - set.size();
        System.out.println(ans);
        sc.close();
    }
}
