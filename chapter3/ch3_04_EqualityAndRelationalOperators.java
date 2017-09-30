import java.lang.*;
import java.util.Scanner;

public class ch3_04_EqualityAndRelationalOperators
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int x,y;
    boolean a = true, b = false;

    System.out.print("Please input the value of x(integer):");
    x = keyboardInput.nextInt();
    System.out.print("Please input the value of y(integer):");
    y = keyboardInput.nextInt();

    System.out.print("x =" + Integer.toBinaryString(x));
    System.out.println(" y =" + Integer.toBinaryString(y));
    System.out.println("===================");
    System.out.println(" x == y  ==>" + (x == y));
    System.out.println(" x != y  ==>" + (x != y));
    System.out.println(" x > y   ==>" + (x > y));
    System.out.println(" x < y   ==>" + (x < y));
    System.out.println(" x >= y  ==>" + (x >= y));
    System.out.println(" x <= y  ==>" + (x <= y));
    System.out.println("===================");
    System.out.println(" Not a         ==>" + !a);
    System.out.println(" a and b       ==>" + (a && b));
    System.out.println(" a or b        ==>" + (a || b));
    System.out.println(" a nand b      ==>" + !(a && b));
    System.out.println(" a nor b       ==>" + !(a || b));
    System.out.println(" a and (x < y) ==>" + (a && (x < y)));
    }
}
