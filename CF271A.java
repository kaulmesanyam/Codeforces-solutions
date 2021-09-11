import java.util.HashSet;
import java.util.Scanner;

public class CF271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true) {
            year++;
            HashSet<Integer> set = new HashSet<>();
            int temp = year;
            boolean flag = true;
            while(temp > 0) {
                if(set.isEmpty()) {
                    set.add(temp%10);
                } else {
                    if(set.contains(temp%10)){
                        flag = false;
                        break;
                    } else {
                        set.add(temp%10);
                    }
                }
                temp = temp/10;
            }
            if(flag == true) {
                System.out.println(year);
                break;
            } 
        }

        sc.close();
    }  
}
