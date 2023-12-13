public class VarArgs {

    static int sum (int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("1: " + sum(1, 2, 3));
        System.out.println("2: " + sum(5, 5));
        System.out.println("3: " + sum(6, 7));
        System.out.println("4: " + sum(7, 8));
    }
}
