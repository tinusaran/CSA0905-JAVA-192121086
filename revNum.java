import java.util.*;
class revNum{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int num,rem,rev=0;
System.out.print("Enter a Number :");
num=s.nextInt();
while(num>0){
rem=num%10;
rev=rev*10+rem;
num=num/10;}
System.out.print("Reversed NUmber = "+rev);
}
}
