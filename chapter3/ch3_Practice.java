import java.lang.*;
public class ch3_Practice
{
  public static void main(String args[])
  {
    int x = 1, y = 1, z = 1, w = 1;
    z = ++x-y++;
    System.out.println("z = " + z);
    w = z + x++ + ++y;
    System.out.println("w = " + w);
  }
}
