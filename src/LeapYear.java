import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year you want to calculate ");
        int year= scan.nextInt();
        if(year<1000 || year>9999){
            System.out.println("Enter a valid 4 digit number");
            return;
        }
        boolean isLeapYear=(year%400==0) || (year%4==0 && year%100!=0);
        if(isLeapYear){
            System.out.println("Year "+year+" is a leap year ");
        }
        else{
            System.out.println("Year "+year+" is not a leap year ");
        }
    }
}
