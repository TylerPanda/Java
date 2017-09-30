import java.lang.*;
import java.util.Scanner;

public class ch3_05_BitwiseAndBitShiftOperator
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    short x, y, p;
    int xx =0;

    System.out.print("Please input the value of x (short):");
    x = keyboardInput.nextShort();
    System.out.print("Please input the value of y (short):");
    y = keyboardInput.nextShort();
    System.out.print("Please input the value of p (short):");
    p = keyboardInput.nextShort();

    System.out.println("p = " + p);
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("------------------------");
    System.out.println("not xx     ==> " + ~xx);
    System.out.println(" x and y   ==>" + (x & y));
    System.out.println(" x or y    ==>" + (x | y));
    System.out.println(" x xor y   ==>" + (x ^ y));
    System.out.println(" x >>> p   ==>" + (x >>> p));
    System.out.println(" x << p    ==>" + (x << p));
  }
}
