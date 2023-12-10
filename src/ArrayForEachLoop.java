import java.util.*;
public class ArrayForEachLoop {
    public static void takeArrayInput(int arr[], int size){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void printArray(int arr[]){
        for(int element: arr){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        takeArrayInput(arr, size);
        printArray(arr);
    }
}
