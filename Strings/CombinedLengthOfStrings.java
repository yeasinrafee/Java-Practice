import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = 0;

        String[] arr = new String[sc.nextInt()];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
            len += arr[i].length();
        }
        System.out.println(len);
    }
}