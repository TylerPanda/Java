import java.lang.*;
import java.io.Console;

public class ch3_02_ConsoleMode
{
  public static void main(String args[])
  {
    Console console = System.console();
    String str1;
    char[] PW;

    System.out.print("Please input the account:" );
    str1 = console.readLine();
    PW = console.readPassword("Please input the password:" );

    System.out.println("Your account is " + str1);
    System.out.print("Your password is ");
    System.out.println(PW);
  }
}
