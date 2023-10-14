import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Character: ");
        char c = sc.next().charAt(0);
        if(Character.isLetter(c)){
            if((c == 'A' || c == 'a') || (c == 'E' || c == 'e') || (c == 'I' || c == 'i') || (c == 'O' || c == 'o') || (c == 'U' || c == 'u')){
                System.out.println(c + " is a vowel.");
            }else{
                System.out.println(c + " is a consonant.");
            }
        }else{
            System.out.println(c + " is an invalid input.");
        }
    }
}
