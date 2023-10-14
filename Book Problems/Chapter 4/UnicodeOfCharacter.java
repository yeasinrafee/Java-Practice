import java.util.Scanner;

public class UnicodeOfCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);
        int uniOfChar = (int)c;
        System.out.println("The unicode of " + c + " is " + uniOfChar);

    }
}
