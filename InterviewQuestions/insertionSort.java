
public class insertionSort{
    public static void insertion(int arr[]){
        for ( int i=0; i<arr.length ; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            } 
            arr[j+1] = current;
        }
        for( int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,4,7,8,9};
        insertion(arr);
    }}
