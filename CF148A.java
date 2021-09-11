import java.util.Scanner;
public class CF148A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        for(int i = 0; i < 5; i++) {
            input[i] = sc.nextInt();
        }

        int[] arr = new int[input[4]];

        for(int i = 0; i < 4; i++) {
            int n = input[i];

            for(int j = 0; j < input[4]; j++) {
                if(((j + 1) % n == 0) && arr[j] != 1) {
                    arr[j] = 1;
                }
            }
        }

        int count = 0;

        for(int i : arr) {
            if(i == 1) count++;
        }
        System.out.println(count);
        sc.close();
    }    
}
