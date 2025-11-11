

public class largestAndSmallest{
    public static void main(String[] args) {
        int[] number = {12, -10 , 23, 45 , 0 , -99};


        int largest = number[0];
        int smallest = number[0];

        for ( int i = 1 ;i<number.length ; i++){
            if(number[i]>largest){
                largest = number[i];
            }
            else if ( number[i]<smallest){
                smallest = number[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }}
