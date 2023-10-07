import java.util.Scanner;

public class FindMinMaxValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the size of your array: ");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Give the array elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max value: " + max + " and Min value: " + min);
    }
}
