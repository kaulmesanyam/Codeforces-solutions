import java.util.Scanner;
public class CF266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = sc.next().toCharArray();
        int count = 0;
        for(int i = 0; i < n - 1; i++) {
            if(str[i] == str[i + 1]) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
