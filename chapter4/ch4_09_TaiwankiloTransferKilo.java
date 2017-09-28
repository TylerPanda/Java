import java.lang.*;
import java.util.Scanner;

public class ch4_09_TaiwankiloTransferKilo
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    double k, tk;

    System.out.print("請輸入幾台斤:");
    tk = Double.parseDouble(keyboardInput.nextLine());
    k =  tk * 0.6;
    System.out.println(tk + "台斤 = " + k + "公斤");

    if(k == tk *0.6)
    {
      System.out.println("答對了");
    }
    else
    {
      System.out.println("答錯了");
    }
  }
}
