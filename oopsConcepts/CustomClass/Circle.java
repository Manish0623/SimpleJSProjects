//package oopsConcepts.CustomClass;

import java.util.Scanner;
class circle{
    float radius;

public float getArea(){
    return (4*3.14f * radius * radius)/3;
}

public float getPerimeter(){
    return (2*3.14f * radius);
}

}


public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();

System.out.println(" Enter the radius : ");
c.radius = sc.nextFloat();


System.out.println("The area of circle: " + c.getArea());
System.out.println("The area of circle: " + c.getPerimeter());

    }
}
