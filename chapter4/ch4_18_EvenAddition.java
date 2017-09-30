import java.lang.*;
import java.util.Scanner;

public class ch4_18_EvenAddition
{
  public static void main(String args[])
  {
    int Sum = 0;
    int i;

    for(i=1 ; i<=10 ; i++)
    {
      if(i % 2 == 1)
      {
        continue;
      }
      Sum = Sum + i;
    }
    System.out.println("2 + 4 + 6 +8 + 10 = " + Sum);
  }
}
