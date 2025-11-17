

public class recursion3{
    public static int Print(int n){
        if( n == 0) return 0 ;
        return n + Print(n-1);
    }
    public static void main(String[] args) {
        int n= 9;
System.out.println(Print(n));
    }}
