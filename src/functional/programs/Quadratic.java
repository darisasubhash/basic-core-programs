package functional.programs;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scan.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scan.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scan.nextDouble();
        if (a == 0) {
            System.out.println("Value of a must not be 0 for a quadratic equation.");
            return;
        }
        double delta = (b*b) - (4*a*c);
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Roots are real and different ");
            System.out.println("Root 1 : " + root1);
            System.out.println("Root 2 : " + root2);

        }
        else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal ");
            System.out.println("Root : " + root);

        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("Roots are complex ");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
