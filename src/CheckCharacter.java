import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enetr the character : ");
        char ch=scan.next().charAt(0);
        if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
            char c=Character.toLowerCase(ch);
            if(c == 'a' || ch== 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println("Entered Character is Vowel ");
            }
            else{
                System.out.println("Entered Character is Consonant ");
            }
        }
        else{
            System.out.println("Enter a valid Character ");
        }
    }
}
