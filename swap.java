import java.util.*;
class swap
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int x,y,temp;
System.out.print("Enter the value of x :");
x=s.nextInt();
System.out.print("Enter the value of y :");
y=s.nextInt();
System.out.println("Value of x before Swapping :"+x);
System.out.println("Value of y before Swapping :"+y);
temp=x;
x=y;
y=temp;
System.out.println("Value of x after Swapping :"+x);
System.out.println("Value of y after Swapping :"+y);
}
}