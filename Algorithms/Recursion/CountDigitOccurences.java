import java.util.Scanner;

class CountDigitOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        long number = sc.nextLong();
        

        if (String.valueOf(number).length() == 5) {
            System.out.println("Enter a digit: ");
            int digit = sc.nextInt();
            int count = countDigitOccurrences(number, digit);
            System.out.println("The digit " + digit + " appears " + count + " times in the integer " + number + ".");
        } else {
            System.out.println("Not a Valid Input");
        }
    }

    public static int countDigitOccurrences(long number, int digit) {
        int count = 0;
        while (number != 0) {
            int lastDigit = (int) (number % 10);
            if (lastDigit == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}