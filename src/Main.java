import java.util.Scanner;

public class Main{
    public static int addNum(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        try{
            for(int i = 0; i < size; i++){
                System.out.println(arr[i+i]);
            }
        }catch( Exception exception){
            System.out.println("What's Up Nigga!");
            System.out.println(addNum(56, 89));
        }
        System.out.println("Array Items will not print");


    }
}