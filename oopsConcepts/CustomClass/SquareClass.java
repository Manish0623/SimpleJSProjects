


class square{
    int side;

public int getArea(){
    return (side*side);
}
public int getPerimeter(){
return (4*side);
}

}

public class SquareClass {
    public static void main(String[] name){
        square sq = new square();

sq.side = 10;

System.out.println(" The area of the square : " + sq.getArea());
System.out.println(" The perimeter of the square is : " + sq.getPerimeter());

    }
}
