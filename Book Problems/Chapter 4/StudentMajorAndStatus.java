import java.util.Scanner;

public class StudentMajorAndStatus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String statusCode = sc.nextLine();

        char major = statusCode.charAt(0);
        char statusYear = statusCode.charAt(1);

        String s1 = "";
        String s2 = "";

        if (major == 'M') {
            s1 = "Mathematics";
        }
        else if (major == 'C') {
            s1 = "Computer Science";}
        else if (major == 'I') {
            s1 = "Information Technology";}

        if (statusYear == '1') {
            s2 = "Freshman";
        }
        else if (statusYear == '2') {
            s2 = "Sophomore";}
        else if(statusYear == '3') {
            s2 = "Junior";}
        else if(statusYear == '4') {
            s2 = "Senior";}

        System.out.println(s1 + " " + s2);
    }
}
