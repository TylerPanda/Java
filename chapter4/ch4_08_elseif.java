import java.lang.*;
import java.util.Scanner;

public class ch4_08_elseif
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int Score;

    System.out.print("請輸入成績:");
    Score = Integer.parseInt(keyboardInput.nextLine());

    if(Score < 60)
    {
      System.out.println("分數等級為丁等");
    }
    else if(Score <= 69)
    {
      System.out.println("分數等級為丙等");
    }
    else if(Score <= 79)
    {
      System.out.println("分數等級為乙等");
    }
    else if(Score <= 89)
    {
      System.out.println("分數等級為甲等");
    }
    else if(Score <= 100)
    {
      System.out.println("分數等級為優等");
    }
    else
    {
      System.out.println("請輸入正確的成績");
    }
  }
}
