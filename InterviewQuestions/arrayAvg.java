

public class arrayAvg{
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        double total = 0;

        for ( double e: num){
            total = total +e;
        }
        System.out.println(total);
System.out.println("avg is : " + ((total / num.length)));
    }}
