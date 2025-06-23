package Exercise4;

public class MathDemo {

    // i. int min(int a, int b)
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // j. int max(int a, int b)
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // k. int sum(int[] args)
    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    // l. float mean(int[] args)
    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    // m. int factorial(int n)
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 1, 9};

        System.out.println("Min: " + min(5, 10));
        System.out.println("Max: " + max(5, 10));
        System.out.println("Sum: " + sum(nums));
        System.out.println("Mean: " + mean(nums));
        System.out.println("Factorial(5): " + factorial(5));
    }
}

