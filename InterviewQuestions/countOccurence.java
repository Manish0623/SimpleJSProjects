 public class countOccurence{

 
public static void main(String[] args){
    String str = " what are you doing mama ?";

    System.out.println(getChar(str , 't'));
}
public static long getChar(String str , char c){
    return str 
    .chars()
    .filter(e -> (char)e == 'a')
    .count();
}
 }