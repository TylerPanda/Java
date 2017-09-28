import java.lang.*;
import java.util.Scanner;

public class ch4_12_SwitchCase
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    int Scores;

    System.out.print("請輸入成績:");
    Scores = keyboardInput.nextInt();

    if(Scores >=0 && Scores <= 100)
    {
      switch(Scores / 10)
    {
        case 10:
          System.out.println("完美分數");
          break;
        case 9:
          System.out.println("分數等級為優等");
          break;
        case 8:
          System.out.println("分數等級為甲等");
          break;
        case 7:
          System.out.println("分數等級為乙等");
          break;
        case 6:
          System.out.println("分數等級為丙等");
          break;
        default:
          System.out.println("分數等級為丁等");
          break;
    }
  }
}
}
