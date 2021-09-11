import java.util.Scanner;
public class CF59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        sc.close();
        int lower = 0;

        for(int i = 0; i < str.length; i++) {
            if(Character.isLowerCase(str[i])) lower++;
        }

        if((str.length%2 == 0) && (lower >= str.length/2)) {
            for(int i = 0; i< str.length; i++) {
                if(Character.isUpperCase(str[i])) {
                    str[i] = Character.toLowerCase(str[i]);
                }
            }
        } else if(str.length%2 == 0) {
            for(int i = 0; i< str.length; i++) {
                if(Character.isLowerCase(str[i])) {
                    str[i] = Character.toUpperCase(str[i]);
                }
            }
        } else if(lower > str.length/2){
            for(int i = 0; i< str.length; i++) {
                if(Character.isUpperCase(str[i])) {
                    str[i] = Character.toLowerCase(str[i]);
                }
            }
        } else {
            for(int i = 0; i< str.length; i++) {
                if(Character.isLowerCase(str[i])) {
                    str[i] = Character.toUpperCase(str[i]);
                }
            }
        }

        System.out.println(new String(str));
    }
}
