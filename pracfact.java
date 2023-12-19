import java.util.*;
class pracfact{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int fact=1,num,i;
System.out.print("Enter a number :");
num=s.nextInt();
for(i=1;i<=num;i++){
fact=fact*i;
}
System.out.print("Factorial of "+num+" is "+fact);
}
}
