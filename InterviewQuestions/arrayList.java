



import java.util.ArrayList;
public class arrayList{
    public static void main(String[] args) {
        ArrayList<Integer> item = new ArrayList<>();


        item.add(0);
        item.add(1);
        item.add(2);

System.out.println(item);

int element = item.get(0);
System.out.println(element);

item.add(1,1);
System.out.println(item);
    }}
