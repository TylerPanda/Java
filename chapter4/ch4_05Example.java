import java.lang.*;
import java.util.Scanner;

public class ch4_05Example
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    String str1 = new String("恭喜您猜到了!!!");
    int ans = 38;
    int Guess;

    System.out.print("請猜一個1~99的號碼:");
    Guess = Integer.parseInt(keyboardInput.nextLine());
    if(Guess != ans)
      str1 = (Guess > ans) ? "您猜得太大了" : "您猜得太小了";
    System.out.print(str1);
  }
}
