import java.util.*;
class voting
{
public static void main(String arg[])
{
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("enter your age:");
a=s.nextInt();
if(a>=18){
System.out.println("you are eligible to vote");}
else{
b=18-a;
System.out.println("you are allowed to vote after "+b+" years");}
}
}