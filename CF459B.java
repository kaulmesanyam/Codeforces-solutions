import java.util.*;

public class CF459B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = sc.nextLong();
        long max = min;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(min, 1);
        for(long i = 1; i < n; i++) {
            long temp = sc.nextInt();
            if(map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else map.put(temp, 1);

            if(temp > max) max = temp;
            if(temp < min) min = temp;
        }

        int minCount = map.get(min);
        int maxCount = map.get(max);

        long diff = max - min;
        long ways = 0;
       if(max == min) {
            ways = (long)(1L*n*(n - 1)/2);
       } else {
           ways = (long)(1L*minCount*maxCount);
       }
        System.out.println(diff + " " + ways);
        sc.close();
    }
}
