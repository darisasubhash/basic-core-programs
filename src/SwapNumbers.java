import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First number : ");
        int n1= scan.nextInt();
        System.out.println("Enter Second number : ");
        int n2= scan.nextInt();
        System.out.println("Numbers after swap : "+ n1+" "+n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("Numbers after swap : "+ n1+" "+n2);
    }
}
