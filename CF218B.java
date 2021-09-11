import java.util.ArrayList;
import java.util.Scanner;

public class CF218B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(m);
        
        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }
        ArrayList<Integer> arr2 = new ArrayList<>(arr);
       int minPrice = 0;
       int maxPrice = 0;

       for(int i = 0; i < n; i++) {
           int min = minSeats(arr);
           minPrice += min;
       }

       for(int i = 0; i < n; i++) {
            int max = maxSeats(arr2);
            maxPrice += max;
        }
        System.out.println(maxPrice + " " + minPrice);
        sc.close();
    }

    public static int minSeats(ArrayList<Integer> arr) {
        int min = 1000;
        int location = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) <= min && arr.get(i) > 0) {
                min = arr.get(i);
                location = i;
            }
        }

        arr.remove(location);
        arr.add(min - 1);
        return min;
    }

    public static int maxSeats(ArrayList<Integer> arr) {
    int max = 1;
    int location = 0;
    for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i) >= max) {
            max = arr.get(i);
            location = i;
        }
    }

    arr.remove(location);
    arr.add(max - 1);
    return max;
    }
    
}
