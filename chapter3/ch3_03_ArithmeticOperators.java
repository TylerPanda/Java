import java.lang.*;
import java.util.Scanner;

public class ch3_03_ArithmeticOperators
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    float answer, a, b, c;
    int x,y;

    System.out.print("Please input the valuse of x(integer):");
    x = keyboardInput.nextInt();
    System.out.print("Please input the value of y(integer):");
    y = keyboardInput.nextInt();

    System.out.print("When x =" + x +"  ");
    System.out.println("y=" + y );
    System.out.println("x + y =" + (x+y));
    System.out.println("x - y =" + (x-y));
    System.out.println("x * y =" + (x*y));
    System.out.println("x / y =" + (x/y));
    System.out.println("x % y =" + (x%y));
    System.out.println("---------------------");

    System.out.print("Please input the value of a(float):");
    a = keyboardInput.nextFloat();
    System.out.print("Please input the value of b(float):");
    b =keyboardInput.nextFloat();
    System.out.print("Please input the value of c(float):");
    c = keyboardInput.nextFloat();

    answer = b*b-4*a*c;

    System.out.println("b^2-4*a*c=" + answer);
  }
}
