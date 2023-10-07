 class Number_triangle {
    public static void main(String[] args){
        int n = 6; 

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("0 ");
                }else{
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
