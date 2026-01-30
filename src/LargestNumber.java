import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First number");
        int n1=scan.nextInt();
        System.out.println("Enter Second number");
        int n2=scan.nextInt();
        System.out.println("Enter Third number");
        int n3=scan.nextInt();
        int max=Math.max(Math.max(n1,n1),n3);
        System.out.println("Maximum number among Three numbers is : "+max);
    }
}
