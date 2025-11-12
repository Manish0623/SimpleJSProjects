
public class divideByZero{
    public static void main(String[] args) {
  int a = 12 ; 
  int b = 0;
  try {
      int result = a/b;
      System.out.println(result);
  } catch (ArithmeticException e) {
    System.out.println("It can be divided by zero..");
  }
  double d = 10.0;
  double e = 0.0;
  double result1 = d/e;
  System.out.println(result1);
    }}
