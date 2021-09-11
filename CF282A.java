import java.io.*;
import java.util.*;
public class CF282A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            Set<Character> set = new HashSet<>();
            for(int j = 0; j < str.length(); j++) {
                set.add(str.charAt(j));
            }
            if(set.contains('+')) ans++;
            else ans--;
        }
        System.out.println(ans);
    }
}
