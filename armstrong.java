import java.util.Scanner;
class armstrongNum
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter any value: ");
int num=input.nextInt();
int sum=0;
int temp=num;
while(temp!=0)
{
int r=temp%10;
sum=sum+r*r*r;
temp=temp/10;
}
if(sum==num)
{
System.out.println("armstrong number");
}
else
{
System.out.println("not an armstron number");
}
}
ystem.out.println("number is not found");
}

~
