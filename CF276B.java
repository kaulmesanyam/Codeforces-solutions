import java.util.Scanner;
public class CF276B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int i = 0;
        int j = str.length() - 1;

        int count = 0;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                count++;
            }
            i++;
            j--;
        }

        if(count % 2 == 0) System.out.println("First");
        else System.out.println("Second");
        sc.close();
    }
}
