import java.lang.*;
import java.util.Scanner;

public class ch4_15_ForStatement
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int Sum = 0,n;

    System.out.print("請輸入N值:");
    n = Integer.parseInt(keyboardInput.nextLine());

    for(int i = 1 ; i <= n ; i=i+2)
    {
      Sum = Sum + i;
    }
    if((n%2) ==1)
    {
      System.out.println("1+3+5+...+N=" + Sum);
    }
    else
     {
      System.out.println("1+3+5+...+(N-1)=" + Sum);
     }
  }
}
