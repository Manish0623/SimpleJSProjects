

public class recursion2{
    public static void element(int n){
        if( n == 6){
            return ;
        }
        System.out.print(n + " ");
        element(n+1);
    }
    public static void main(String[] args) {
        int n= 1;
        element(n);
    }}
