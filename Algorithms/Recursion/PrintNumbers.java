public class PrintNumbers{
    
    public static  void printNumbers(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void printNumbersRegular(int n){
        if(n == 6)
            return;
        System.out.println(n);
        printNumbersRegular(n+1);
    }
    public static void main(String[] args){
        printNumbersRegular(1);
    }
}