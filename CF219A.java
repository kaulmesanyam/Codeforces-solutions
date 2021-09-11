import java.util.*;
public class CF219A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }  
        }

        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for(Character c : map.keySet()) {
            
            if(map.get(c) % n != 0) {
                flag = false;
                break;
            } else {
                int k = map.get(c)/n;

                for(int i = 0; i < k; i++) {
                    sb.append(c);
                }
            }
        }

        if(flag) {
            if(sb.length() == 1) {
                System.out.println(str);
            } else {
                for(int i = 0; i < n; i++) {
                    System.out.print(new String(sb));
                }
            }
        } else {
            System.out.print(-1);
        }
        
        
        sc.close();
    }
}
