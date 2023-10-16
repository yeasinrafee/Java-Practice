import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String firstInput = sc.next();

        System.out.print("Enter string s2: ");
        String secondInput = sc.next();

        if (firstInput.contains(secondInput))
            System.out.println(secondInput + " is a substring of " + firstInput);
        else
            System.out.println(secondInput + " is not a substring of " + firstInput);
    }
}
