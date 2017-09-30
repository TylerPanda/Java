import java.util.Scanner;

public class ch3_01_ScannerJava
{
  public static void main(String args[])
  {
    Scanner keyboardInput = new Scanner(System.in);
    String str1, str2;

    System.out.print("Please, input the first string:" );
    str1 = keyboardInput.nextLine();
    System.out.print("Please, input the second string:" );
    str2 = keyboardInput.nextLine();
    System.out.println("Srings which you input:");
    System.out.println(str1);
    System.out.println(str2);
  }
}
