import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args){
        double s, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length of the side of the Hexagon:");
        s = sc.nextFloat();
        area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("The area of the hexagon is: %.2f", area);
    }
}
