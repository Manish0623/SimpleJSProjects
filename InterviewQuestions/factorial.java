
public  class  factorial{
    public static int factorial(int n){
        if( n == 0 || n ==1){
            return 1 ;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args){
        int n = 7;
        int result = factorial(n);
        System.out.println(result);
    }
}