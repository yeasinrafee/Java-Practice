import java.util.Scanner;

public class PalindromeNumber {
    public static int reverse(int num){
        int reversed = 0;
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println(num + " is a palindrome.");
        }else{
            System.out.println(num + " is not a palindrome.");
        }
    }
}
