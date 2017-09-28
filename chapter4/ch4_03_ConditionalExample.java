import java.lang.*;
public class ch4_03_ConditionalExample
{
  public static void main(String args[])
  {
    boolean x = false;
    String str1 = new String("x為真");
    if(x = false)
      str1 = "x為假";
    System.out.println(str1);
  }
}
 
