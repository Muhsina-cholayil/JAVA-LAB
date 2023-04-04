import java.util.Scanner;
class sum
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number: ");
int num=input.nextInt();
int sum=0;
while(num!=0)
{
sum=sum+num%10;
num=num/10;
}
System.out.println("sum of given number is: "+sum);
}
}
