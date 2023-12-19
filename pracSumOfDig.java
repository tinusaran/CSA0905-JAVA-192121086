import java.util.*;
class pracSumOfDig{
public static void main(String arg[]){
int n,num,sum=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of n :");
n=s.nextInt();
System.out.print("Enter a "+n+" digit number :");
num=s.nextInt();
while(num>0){
sum=sum+num%10;
num=num/10;
}
System.out.print("Sum of digits ="+sum);
}
}

