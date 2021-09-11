import java.util.Scanner;
public class CF200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] arr = new double[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt()/100.0;
        }

        double sum = 0;
        for(double i : arr) {
            sum = sum + i;
        }
        System.out.println((sum/(double)n)*100);
        sc.close();
    }
}
