import java.util.Scanner;
public class CF144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largestNumPos = findLargestNumPos(arr, n);
        int smallestNumPos = findSmallestNumPos(arr, n);
        if(largestNumPos == 0 && smallestNumPos == n -1) {
            System.out.println(0);
        } else if(largestNumPos < smallestNumPos) {
            System.out.println(((largestNumPos + (n - smallestNumPos)) - 1));
        } else {
            System.out.println( ((largestNumPos + (n - (smallestNumPos) )) - 2) );
        }
        sc.close();
    }

    private static int findSmallestNumPos(int[] arr, int n) {
        int smallest = arr[n - 1];
        int pos = n - 1;

        for(int i = n -2; i >= 0; i--) {
            if(arr[i] < smallest) {
                smallest = arr[i];
                pos = i;
            }
        }
        return pos;
    }

    private static int findLargestNumPos(int[] arr, int n) {
        int largest = arr[0];
        int pos = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
                pos = i;
            }
        }
        return pos;
    }
}
