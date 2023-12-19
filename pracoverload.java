import java.util.*;
class pracoverload{
void calculate(int x,int y){
int a,b,c;
a=x;
b=y;
c=a+b;
System.out.println(a+"+"+b+"="+c);}
void calculate(int x,int y,int z){
int a,b,c,d;
a=x;
b=y;
c=z;
d=a+b+c;
System.out.println(a+"+"+b+"+"+c+"="+d);
}
public static void main(String arg[]){
int x,y,z;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
x=s.nextInt();
System.out.print("Enter another number:");
y=s.nextInt();
System.out.print("Enter another number:");
z=s.nextInt();
pracoverload obj=new pracoverload();
obj.calculate(x,y);
obj.calculate(x,y,z);
}
}