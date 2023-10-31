import java.util.Scanner;

public class SumTheDigits {

    public static int sumTheDigits(long num){
        int sum = 0;
        while(num > 0){
            int digit = (int)(num % 10);
            sum += digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your number: ");
        long num = sc.nextLong();
        int digitsSum = sumTheDigits(num);
        System.out.println("Sum of the digits is: " + digitsSum);
    }
}
