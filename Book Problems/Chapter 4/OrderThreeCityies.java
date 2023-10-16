import java.util.*;

public class OrderThreeCityies {
    public static void main(String[] args){
        String[] cityNames = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        cityNames[0] = sc.nextLine();
        cityNames[1] = sc.nextLine();
        cityNames[2] = sc.nextLine();
        String[] newCityNames = new String[3];
        newCityNames = Arrays.sort(cityNames);
        
    }
}
