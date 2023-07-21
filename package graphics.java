import Graphics.*;
import java.util.Scanner;
class Main2
{
      public static void main(String args[])
        {
          Graphics.Rect r1=new Graphics.Rect();
          Graphics.Circle c1=new Graphics.Circle();
          Graphics.Squ s1=new Graphics.Squ();
          Graphics.Tri t1=new Graphics.Tri();

          r1.read();
          c1.read();
          s1.read();
          t1.read();
        }
}
~
~


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


package Graphics;
import java.util.Scanner;
interface Area
    {
    public void read();
    }
       public class Circle
      {
       public void read()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the radious::");
          int r=sc.nextInt();
          double a=3.14*r*r;
          System.out.println("area of circle::"+a);
      }
}



package Graphics;
import java.util.Scanner;
interface Area
    {
    public void read();
    }
       public class Squ
      {
       public void read()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the length of side::");
          int l=sc.nextInt();
          int a=l*l;
          System.out.println("area of square::"+a);
      }
}


~
package Graphics;
import java.util.Scanner;
interface Area
    {
    public void read();
    }
       public class Tri
      {
       public void read()
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the length ::");
          int l=sc.nextInt();
          System.out.println("enter the height::");
          int h=sc.nextInt();
          int a=l*h;
          System.out.println("area of triangle::"+a);
      }
}



~
