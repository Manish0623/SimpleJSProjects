

public class hanoi{
    public static void Solve( int n , char source , char helper , char destination){
        if ( n == 1){
            System.out.println(" Move disk 1 from " + source + " to " + destination);
            return;
        }
        Solve( n-1 , source , destination , helper);
        System.out.println(" Move disk " + n + " from " + source + " to " + destination);
        Solve(n-1 , helper , source , destination );
      
    }
    public static void main(String[] args) {
        int n = 3 ; 
Solve( n , 'A' , 'B' , 'C');
    }}
