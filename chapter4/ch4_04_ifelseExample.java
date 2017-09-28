import java.lang.*;
import java.util.Scanner;

public class ch4_04_ifelseExample
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int OnePrice = 200, Qty;
    double TotalPrice;

    System.out.println("每一張入場券的價錢:" + OnePrice + "元");
    System.out.print("請輸入要購買的張數:");
    Qty = Integer.parseInt(keyboardInput.nextLine());
    // TotalPrice = Qty * OnePrice;
    System.out.println("=====================================");
    if(Qty >= 10)
    {
      TotalPrice = OnePrice * Qty * 0.9;
      System.out.println("購買十張打九折");
    }
    else
    {
      TotalPrice = OnePrice * Qty;
      System.out.println("您為購買十張以上的入場券,怒不打折");
    }
    System.out.println("總價為:" + TotalPrice + "元");
  }  
}
