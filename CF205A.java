import java.util.*;

public class CF205A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int min = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> mapP = new HashMap<>();

        for(int i = 0; i < n; i++) {
            
            if(i == 0) {
                min = sc.nextInt();
                map.put(min, 1);
                mapP.put(min, i + 1);
            } else {
                int num = sc.nextInt();
                if(num < min) min = num;
                if(map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
                mapP.put(num, i + 1);
            }
        }

        if(map.get(min) == 1) System.out.println(mapP.get(min));
        else System.out.println("Still Rozdil");
        sc.close();
    }
}
