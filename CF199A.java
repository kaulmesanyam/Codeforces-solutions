import java.util.ArrayList;
import java.util.Scanner;

public class CF199A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1 ) {
            System.out.println("0 0 1");
        } else if(n == 2){
            System.out.println("0 1 1");
        }else if(n == 3) {
            System.out.println("1 1 1");
        } else if(n == 0) {
            System.out.println("0 0 0");
        } else {
            ArrayList<Integer> arr = getFib(n);
            System.out.println(arr.get(arr.size() - 5) + " " + arr.get(arr.size() - 4) + " " + arr.get(arr.size() - 2));
        }
        sc.close();
    }

    private static ArrayList<Integer> getFib(int n) {
        int a = 0;
        int b = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        int c = a + b;
        while(c != n) {
            arr.add(c);
            a = b;
            b = c;
            c = a + b;
        }
        arr.add(c);
        return arr;
    }
}
