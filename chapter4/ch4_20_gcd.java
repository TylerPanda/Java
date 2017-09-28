import java.lang.*;
import java.util.Scanner;

public class ch4_20_gcd
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int x, y, gcd, temp;

    System.out.print("請輸入x: ");
    x = keyboardInput.nextInt();
    System.out.print("請輸入y: ");
    y = keyboardInput.nextInt();
    System.out.print("(" + x + "," + y + ")=");

    if(x < y)
    {
      temp = x;
      x = y;
      y = temp;
    }
    while(x != 0)
    {
      x = x%y;
      if(x != 0)
      {
        temp = x;
        x = y;
        y = temp;
      }
    }
    gcd = y;
    System.out.println(gcd);
  }
}
