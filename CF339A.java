import java.util.Scanner;
public class CF339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] arr = new int[3];

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1')arr[0]++;
            if(str.charAt(i) == '2')arr[1]++;
            if(str.charAt(i) == '3')arr[2]++;
        }
        StringBuilder sb = new StringBuilder();

        while(arr[0]-- > 0) {
            sb.append('1');
            sb.append('+');
        }
        while(arr[1]-- > 0) {
            sb.append('2');
            sb.append('+');
        }
        while(arr[2]-- > 0) {
            sb.append('3');
            sb.append('+');
        }
        if(sb.charAt(sb.length() - 1) == '+') {
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.println(new String(sb));
        sc.close();
    }
}
