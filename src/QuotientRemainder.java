import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int n1 = scan.nextInt();
        System.out.print("Enter the Second Number : ");
        int n2 = scan.nextInt();
        if (n2 == 0) {
            System.out.println("Division by zero is not Possible ");
            return;
        }
        int quotient = n1 / n2;
        int remainder = n1 % n2;
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);
    }
}
