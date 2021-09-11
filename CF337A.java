import java.util.*;
public class CF337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        int min = 10000;
        for(int i = 0; i < f; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        for(int i = 0; i < f; i++) {
            if(i +(n - 1) < f) {
                int temp = Math.abs(arr.get((i + (n - 1))) - arr.get(i));
                if(temp < min) min = temp;
            } else {
                break;
            }
            
        }

        System.out.println(min);
        sc.close();
    }
}
