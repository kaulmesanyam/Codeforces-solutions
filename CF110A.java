import java.util.Scanner;
public class CF110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] n = sc.next().toCharArray();
        int nearly = 0;
        for(int i = 0; i < n.length; i++) {
            if(n[i] == '4' || n[i] == '7') nearly++;
        }
        if(nearly == 4 || nearly == 7) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
