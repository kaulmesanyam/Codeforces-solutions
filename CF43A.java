import java.util.Scanner;
public class CF43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int team1 = 0;
        int team2 = 0;
        String team1Name = "";
        String team2Name = "";
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                team1Name = sc.next();
                team1++;
            } else {
                String temp = sc.next();
                if(temp.equals(team1Name)) team1++;
                else {
                    team2++;
                    if(team2Name.equals("")) {
                        team2Name = temp;
                    }
                } 
            }
        }

        if(team1 > team2)System.out.println(team1Name);
        else System.out.println(team2Name);
        sc.close();
    }
}
