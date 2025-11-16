

public class selectionSort{
    public static void selection(int arr[]){
        for( int i=0 ; i<arr.length-1;i++ ){
            int smallest = i;
            for( int j = i+1 ; j<arr.length; j++){
                if( arr[smallest]> arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for( int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,2,1,8};
        selection(arr);
    }}
