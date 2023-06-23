Rect.java

import Graphics.*;
import java.util.Scanner;
class Main2
{
      public static void main(String args[])
        {
          Graphics.Rect r1=new Graphics.Rect();
          r1.read();
        }
}
~
package.java 


package Graphics;
import java.util.Scanner;
public class Rect
{
    public void read()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the length::");
          int l=sc.nextInt();
          System.out.println("enter the breadth::");
          int b=sc.nextInt();
          int a=l*b;
          System.out.println("area of rectangle::"+a);
      }
}
