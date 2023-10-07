import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = 0;

        System.out.println("Give the size of your array: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Give the array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                index = i;
            }
        }

        System.out.println(index);
        
    }
}
