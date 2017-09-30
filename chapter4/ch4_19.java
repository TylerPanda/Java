import java.lang.*;
import java.util.Scanner;

public class ch4_19
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int Sum=0, i ,n;
    System.out.print("求1~n的總和，請輸入n值:");
    n = Integer.parseInt(keyboardInput.nextLine());
    for(i=1 ; i<=n ; i++)
    {
      if(Sum > Integer.MAX_VALUE-100)
        break;
      Sum = Sum + i;
    }
    System.out.println("1~ " + (i-1) + "的總和為" + Sum);
  }
}
