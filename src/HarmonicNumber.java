public class HarmonicNumber {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Give Harmonic value");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n == 0) {
            System.out.println("value must not be zero.");
            return;
        }
        double harmonic = 0.0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }
        System.out.println("The " + n + "th Harmonic Value is: " + harmonic);
    }
}
