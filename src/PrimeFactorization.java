public class PrimeFactorization {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("provide a number.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n <= 1) {
            System.out.println("Enter number greater than 1.");
            return;
        }
        System.out.print("Prime factors of " + n + " are: ");
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 2) {
            System.out.print(n);
        }
    }
}
