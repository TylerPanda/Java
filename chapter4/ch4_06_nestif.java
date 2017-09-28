import java.lang.*;
import java.util.Scanner;

public class ch4_06_nestif
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int Credit, Status;
    double Year;

    System.out.print("請輸入信貸額度:");
    Credit = Integer.parseInt(keyboardInput.nextLine());
    System.out.print("繳款是否正確:(1:正常;0:不正常):");
    Status = Integer.parseInt(keyboardInput.nextLine());
    if(Status == 1)
    {
      System.out.print("請輸入持卡年份:");
      Year = keyboardInput.nextDouble();
      // Year = Double.parseDouble(keyboardInput.nextLine());
      if(Year >= 0.5)
      {
        if(Year < 1)
        {
          System.out.println("預借現金為:" + (Credit*0.05) + "元");
        }
        else
        {
          System.out.println("預借現金為:" + (Credit*0.1) + "元");
        }
      }
      else
      {
        System.out.println("預借現金金額為: 0 元");
      }
    }
    else
    {
      System.out.println("預借現金金額為: 0元");
    }
  }
}
