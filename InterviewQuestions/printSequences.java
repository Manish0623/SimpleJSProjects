

public class printSequences{
    public static void PRINT(String s , int idx , String curr){
        if(idx == s.length()){
System.out.print(curr + " ");
return ;
        }
        PRINT(s, idx + 1 , curr + s.charAt(idx));
        PRINT( s, idx +1 , curr);
    }
    public static void main(String[] args) {
        String s = "abcd";
        PRINT(s,0,"");
    }}
