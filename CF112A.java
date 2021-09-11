import java.io.*;
public class CF112A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int ans = 0;
        for(int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if(Character.isUpperCase(c1)) c1 = Character.toLowerCase(c1);
            if(Character.isUpperCase(c2)) c2 = Character.toLowerCase(c2);

            if(c1 < c2) {
                ans = -1;
                break;
            } else if(c1 > c2) {
                ans = 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
