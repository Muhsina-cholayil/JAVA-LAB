import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter a number:");
int num=input.nextInt();
int rev=0;
while(num!=0)
{
rev=rev*10+num%10;
num=num/10;
}
System.out.println("reverse of the number:"+rev);
}
}
