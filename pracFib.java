import java.util.*;
class pracFib{
public static void main(String arg[]){
Scanner s=new Scanner(System.in);
int a=0,b=1,c=0,i,limit,sum=0;
System.out.print("Enter limit:");
limit=s.nextInt();
System.out.print(a+" "+b+" ");
for(i=2;i<=limit;i++){
c=a+b;
a=b;
b=c;
System.out.print(c+" ");}
for(i=0;i<=limit;i++){
if(i%2==0){
sum=sum+a;}
}
System.out.println("Sum of even nos :"+sum); 
}
}

