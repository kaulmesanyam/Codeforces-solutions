import java.io.*;
import java.util.*;

public class CF141A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        String pile = br.readLine();
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < name1.length(); i++) {
            if(map.containsKey(name1.charAt(i))) {
                map.put(name1.charAt(i), map.get(name1.charAt(i)) + 1);
            } else {
                map.put(name1.charAt(i), 1);
            }
        }

        for(int i = 0; i < name2.length(); i++) {
            if(map.containsKey(name2.charAt(i))) {
                map.put(name2.charAt(i), map.get(name2.charAt(i)) + 1);
            } else {
                map.put(name2.charAt(i), 1);
            }
        }
        boolean flag = true;
        for(int i = 0; i < pile.length(); i++) {
            if(map.containsKey(pile.charAt(i))) {
                map.put(pile.charAt(i), map.get(pile.charAt(i)) - 1);
            } else {
                flag = false;
                break;
            }
        }

        for(Character c : map.keySet()) {
            if(map.get(c) != 0) {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
