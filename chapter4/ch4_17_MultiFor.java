import java.lang.*;
import java.util.Scanner;

public class ch4_17_MultiFor
{
  public static void main(String args[])
  {
    int i, j;

    for(i=1 ; i<=9 ; i++)
    {
      for(j=1 ; j<=i ; j++)
      {
        System.out.print(i + "*" + j + "=" + i*j + "\t");
      }
      System.out.print("\n");
    }
  }
}
