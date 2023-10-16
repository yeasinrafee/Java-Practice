import java.util.*;

public class OrderThreeCityies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the first country: ");
        String country1 = sc.nextLine();
        System.out.print("Enter the second country: ");
        String country2 = sc.nextLine();
        System.out.print("Enter the third country: ");
        String country3 = sc.nextLine();

        String temp;
        if ((country2.compareTo(country1) > 0) && (country2.compareTo(country3) > 0))
        {
            temp = country1;
            country1 = country2;
            country2 = temp;
        }
        else if ((country3.compareTo(country1) > 0) && (country3.compareTo(country2) > 0))
        {
            temp = country1;
            country1 = country3;
            country3 = temp;

        }

        if (country3.compareTo(country2) > 0)
        {
            temp = country2;
            country2 = country3;
            country3 = temp;
        }

        System.out.println("The three cities in alphabetical order are " +
                country1 + " " + country2 + " " + country3);
        
    }
}
