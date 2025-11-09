//package oopsConcepts.CustomClass;
import java.util.Scanner;
class rectangle{

int length;
int width;


public int getArea(){
    return (length * width);
}

public int getPerimeter(){
    return (2* (length + width));
}

}

public class Rectangle {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
rectangle rc = new  rectangle();

System.out.println(" Enter the length : ");
rc.length = sc.nextInt();

System.out.println(" Enter the width : ");
rc.width = sc.nextInt();


System.out.println("The area of rectangle: " + rc.getArea());
System.out.println("The area of rectangle: " + rc.getPerimeter());

    }
}
