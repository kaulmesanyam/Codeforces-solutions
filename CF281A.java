import java.util.Scanner;

public class CF281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        sc.close();
        if(Character.isLowerCase(str[0])) {
            str[0] = Character.toUpperCase(str[0]);
        }

        System.out.println(new String(str));
    }
}
