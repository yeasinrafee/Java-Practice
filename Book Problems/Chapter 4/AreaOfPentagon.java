import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args){
        double s, r, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length of the center of the Pentagon:");
        r = sc.nextFloat();
        s = (2 * r * Math.sin(Math.PI / 5));
        area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is: %.2f", area);
    }
}
