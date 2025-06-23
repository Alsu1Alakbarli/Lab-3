import java.util.Scanner;
import java.util.Arrays;

public class MinMaxArray {

    // a. Method to calculate minimum element
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    // b. Method to calculate maximum element
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // c. Method to return both min and max at the same time
    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        // i. Take input from command line arguments
        if (args.length > 0) {
            int[] commandLineArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                commandLineArray[i] = Integer.parseInt(args[i]);
            }
            System.out.println("From command line:");
            System.out.println("Minimum: " + findMin(commandLineArray));
            System.out.println("Maximum: " + findMax(commandLineArray));
        }

        // ii. Take input from user using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] userArray = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            userArray[i] = sc.nextInt();
        }

        int[] minMax = findMinMax(userArray);
        System.out.println("From user input:");
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }
}
